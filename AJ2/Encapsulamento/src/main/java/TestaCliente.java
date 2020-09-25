/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
    	Cliente clicli = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
    	clicli.inicializaCliente("José Camila dos Naiscimento", "145.268.369-89");
        // Impressao dos dados do cliente
    	clicli.imprimeDados();
    	
    	//Testando Getters e Setters  
    	System.out.println(clicli.getNome());
    	System.out.println(clicli.getCPF());
    	clicli.setNome("Fabio Assunção");
    	clicli.setCPF("125.85.963-5465465465");
    	
    	clicli.imprimeDados();
    }
}
