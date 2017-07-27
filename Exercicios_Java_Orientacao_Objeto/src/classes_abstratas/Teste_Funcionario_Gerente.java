package classes_abstratas;

public class Teste_Funcionario_Gerente {
	public static void main(String[] args) {

		Gerente g1 = new Gerente("Andie", "abc123");
		g1.setNome("Andiara");
		g1.setSalario(3500.99);
		g1.calculoBonificacao();
		System.out.println(g1.mostrarDados());
		
		/**
		 * Forma utilizada para tratar os erros do m�todo aumentarSalario() gerar
		 * 
		 * Foi utilizado IllegalArgumentException, que n�o obriga o tratamento sa exce��o,
		 * por isso � utilizado o catch(IllegalArgumentException e) {},
		 * para tratar o erro nesse momento.
		 * Se fosse utilizado uma "Exception", o tratamento seria obrigat�rio.
		 */
		
		try {
			g1.aumentoSalario(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
