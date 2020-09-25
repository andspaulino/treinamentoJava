/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaAgencia {

    public static void main(String[] args) {
        // Inicializar um objeto do tipo Agencia
    	Agencia ag = new Agencia();
        // usar o metodo inicializaAgencia (ver quais sao os parametros na classe Agencia)
    	ag.inicializaAgencia("154284", 8);
        // Imprimir os dados da agencia
    	ag.imprimeDados();
    	
    	
    	//Testando Getters e Setters  
    	System.out.println(ag.getNumero());
    	System.out.println(ag.getBanco());
    	ag.setNumero("555");
    	ag.setBanco(1);
    	
    	ag.imprimeDados();
    }
}
