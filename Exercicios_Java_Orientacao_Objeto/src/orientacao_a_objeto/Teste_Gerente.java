package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Teste_Gerente {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");

		Gerente gerente1 = new Gerente();
		gerente1.nome = "William";
		gerente1.salario = 4500d;
		
		Gerente gerente2 = new Gerente();
		gerente2.nome = "Andiara";
		gerente2.salario = 5500d;

		gerente1.aumentoSalario(15);
		gerente2.aumentoSalario();

		System.out.println("Nome: " + gerente1.nome + " Salario: R$" + df.format(gerente1.salario));
		System.out.println("Nome: " + gerente2.nome + " Salario: R$" + df.format(gerente2.salario));
	}
}
