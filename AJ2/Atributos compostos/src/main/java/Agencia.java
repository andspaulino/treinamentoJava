/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia {

    private String numero;
    private Banco banco;
    private int numeroProximaConta = 1455;
    private int numeroContasAbertas = 0;
    private Conta contas[];

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public Agencia(String num, Banco bc, int numeroMaxContas) {
        this.numero = num;
        this.banco = bc;
        this.contas = new Conta[numeroMaxContas];
    }
    
    /*
     * Metodo abriContas
     */
    public Conta abrirConta(double saldo, Cliente cliente) {
    	Conta novaConta = new Conta(saldo, "" + numeroProximaConta++, cliente, this);
    	adicionaArrayContas(novaConta);
    	return novaConta;
    }
    
    /*
     * Metodo para adicionar contas ao array de contas
     */
    private boolean adicionaArrayContas(Conta abrirNovaConta) {
        if (this.contas.length <= numeroContasAbertas) {
            System.out.println("Banco ERROR: Nao foi possivel criar uma nova conta");
            return false;
        } else {
            System.out.println("Banco DEBUG: Conta adicionada ao array " + numeroContasAbertas);
            this.contas[numeroContasAbertas] = abrirNovaConta;
            numeroContasAbertas++;
            return true;
        }
    }
    
    /*
     * Metodo para imprimir contas
     */
    public void imprimeContas() { 
        System.out.println("\n\n=============== RELATORIO DE CONTAS DA AGÊNCIA ==================\n");
        System.out.println("Numero de contas abertas: " + numeroContasAbertas);
        for (int i = 0; i < numeroContasAbertas; i++) {
            contas[i].imprimeDados();
        }
        System.out.println("===============================================");
    }

    /**
     * @return Numero do banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return Numero da agencia
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param b
     *            banco
     */
    public void setBanco(Banco b) {
        banco = b;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("\nAgencia no. " + numero);
        banco.imprimeDados();
    }

    /**
     * @param num
     *            Numero da agencia
     */
    public void setNumero(String num) {
        numero = num;
    }
}