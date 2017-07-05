package estatico;

import java.text.DecimalFormat;

import orientacao_a_objeto.Funcionario;

public class Classe_Funcionario {
	public static void main(String[] args) {
DecimalFormat df = new DecimalFormat("#0.00");

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		System.out.println("Vale alimentacao: R$" + df.format(Funcionario.consutaVR()));
	}
}
