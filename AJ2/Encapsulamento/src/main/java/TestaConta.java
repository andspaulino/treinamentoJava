/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	

        double saldoTeste = 600.0;
        String numeroTeste = "258";
        String titularTeste = "Lukinhas Skate13";
        int agenciaTeste = 2;
        int bancoTeste = 1;
    	
    	Conta c1 = new Conta();
    	
    	c1.inicializaConta(saldoTeste, numeroTeste, titularTeste, agenciaTeste, bancoTeste);
    	c1.deposito(55.0);
    	c1.imprimeDados();
    	c1.saque(700);
    	c1.imprimeDados();
    }
}
