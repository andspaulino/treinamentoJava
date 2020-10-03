public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        // Leitura do parametro digitado pelo usuario como parametro do main
        String parametro1 = args[0];
        int numero = Integer.parseInt(parametro1);
    }
}


/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at TesteRuntimeExceptions.main(TesteRuntimeExceptions.java:5)
*/

/*Exception in thread "main" java.lang.NumberFormatException: For input string: "teste"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at TesteRuntimeExceptions.main(TesteRuntimeExceptions.java:6)
*/