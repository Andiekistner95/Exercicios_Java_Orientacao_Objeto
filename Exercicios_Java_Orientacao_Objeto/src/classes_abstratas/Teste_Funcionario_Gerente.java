package classes_abstratas;

public class Teste_Funcionario_Gerente {
	public static void main(String[] args) {

		Gerente g1 = new Gerente("Andie", "abc123");
		g1.setNome("Andiara");
		g1.setSalario(3500.99);
		g1.calculoBonificacao();
		System.out.println(g1.mostrarDados());
		
		/**
		 * Forma utilizada para tratar os erros do método aumentarSalario() gerar
		 * 
		 * Foi utilizado IllegalArgumentException, que não obriga o tratamento sa exceção,
		 * por isso é utilizado o catch(IllegalArgumentException e) {},
		 * para tratar o erro nesse momento.
		 * Se fosse utilizado uma "Exception", o tratamento seria obrigatório.
		 */
		
		try {
			g1.aumentoSalario(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
