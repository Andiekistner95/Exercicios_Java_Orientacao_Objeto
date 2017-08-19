package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Teste_Funcionario {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Funcionario fun1 = new Funcionario();
		//Funcionario fun2 = new Funcionario();

		//fun1.nome = "William";
		//fun1.salario = 3000.00d;

		//fun2.nome = "Andiara";
		//fun2.salario = 4000.00d;

		//System.out.println("Nome: " + fun1.nome + " Salario: R$" + df.format(fun1.salario));
		//System.out.println("Nome: " + funcionario2.nome + " Salario: R$" + df.format(funcionario2.salario));

		fun1.aumento(250.00);
		
		//System.out.println(fun1.consultaFuncionario());
		
		fun1.setNome("William");
		fun1.setSalario(3000.00d);
		
		System.out.println(fun1.getNome() +" R$" + df.format(fun1.getSalario()));
	}
}
