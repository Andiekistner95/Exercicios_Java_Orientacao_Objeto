package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Teste_Funcionario {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();

		funcionario1.nome = "William";
		funcionario1.salario = 3000.00d;

		funcionario2.nome = "Andiara";
		funcionario2.salario = 4000.00d;

		System.out.println("Nome: " + funcionario1.nome + " Salario: R$" + df.format(funcionario1.salario));
		//System.out.println("Nome: " + funcionario2.nome + " Salario: R$" + df.format(funcionario2.salario));

		funcionario1.aumento(250.00);
		
		System.out.println(funcionario1.consultaFuncionario());
		
	}
}
