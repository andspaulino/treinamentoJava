/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	   	
    	double saldoTeste = 999;
        String numeroTeste = "1";
        String titularTeste = "Anderson";
        int agenciaTeste = 1337;
        int bancoTeste = 7331;
        
        Conta c1 = new Conta();
    	
    	c1.inicializaConta(saldoTeste, numeroTeste, titularTeste, agenciaTeste, bancoTeste);
    	c1.imprimeDados();
    	c1.saque(960);
    	c1.imprimeDados();
    	c1.deposito(30);
    	c1.imprimeDados();
    }
}
