/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	
    	Conta c1 = new Conta(0, "1", "Anderson", "5", 2);
    	c1.imprimeDados();
    	
    	 Cliente cli1 = new Cliente("Janderson", "123deOliveira4");
    	 cli1.imprimeDados();
    }
}
