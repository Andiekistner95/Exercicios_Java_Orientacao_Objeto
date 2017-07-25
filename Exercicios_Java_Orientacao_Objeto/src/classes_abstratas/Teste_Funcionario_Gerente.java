package classes_abstratas;

public class Teste_Funcionario_Gerente {
	public static void main(String[] args) {

		Gerente g1 = new Gerente("Andie", "abc123");
		g1.setNome("Andiara");
		g1.setSalario(3500.99);
		g1.calculoBonificacao();
		System.out.println(g1.mostrarDados());
	}
}
