/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args - argumentos para o método main
	 */
	public static void main(String[] args) {
		String nome = "Carolina Pereira";
		int idade = 20;
		String rg = "34.654.789-9";
		char sexo = 'M';
		double salario = 1500.0;
		int anoAtual = 2009;
		double aliquota = 0.20;
		int anoNascimento = anoAtual - idade;
		String sexoPorExtenso;
		if (sexo == 'F') {
			sexoPorExtenso = "feminino";
		} else {
			sexoPorExtenso = "masculino";
		}
		double impostoDevido = salario * aliquota;
		String textNome = "O(a) Senhor(a) " + nome;
		String textNasc = ", nascido(a) no ano de " + anoNascimento;
		String textRg = " portador(a)do rg de numero " + rg + ", \n";
		String textSexo = " do sexo " + sexoPorExtenso;
		String textTrabalho = ", está registrado(a) com o salário de R$ " + salario;
		String textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
		String textNomeFeminino = "A senhora " + nome;
		String textNomeMasculino = "O senhor " + nome;
		switch (sexo) {
			case 'F':
				System.out.println(textNomeFeminino + textRg + textNasc + textSexo + textTrabalho + textImposto);
				break;
			case 'M':
				System.out.println(textNomeMasculino + textRg + textNasc + textSexo + textTrabalho + textImposto);
				break;
			default:
				System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho + textImposto);
				break;
		}
	}
}
