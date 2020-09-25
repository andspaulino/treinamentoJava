/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta acc1 = new Conta();
    	
    	acc1.agencia = 1;
    	acc1.banco = 234;
    	acc1.numero = "01945";
    	acc1.titular = "Globalcode";
    	acc1.saldo = 10000.0;

    	 System.out.println("----------------------------- ");
    	 System.out.println("AGENCIA: " + acc1.agencia + " BANCO: " + acc1.banco);
    	 System.out.println("NUMERO : " + acc1.numero);
    	 System.out.println("TITULAR: " + acc1.titular);
    	 System.out.println("SALDO  : " + acc1.saldo);
    	 System.out.println("-----------------------------");
    }
}
