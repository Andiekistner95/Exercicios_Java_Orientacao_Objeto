package orientacao_a_objeto;

public class Teste_Funcionario {
	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();

		funcionario1.nome = "William";
		funcionario1.salario = 3000.00d;

		funcionario2.nome = "Andiara";
		funcionario2.salario = 4000.00d;

		System.out.println("Nome: " + funcionario1.nome + " Salario: " + funcionario1.salario);
		System.out.println("Nome: " + funcionario2.nome + " Salario: " + funcionario2.salario);

	}
}
