package static_Java;

import java.text.DecimalFormat;

import orientacao_a_objeto.Funcionario;

public class Classe_Funcionario {
	public static void main(String[] args) {
		
DecimalFormat df = new DecimalFormat("#0.00");

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		System.out.println("Vale alimentacao: R$" + df.format(Funcionario.consutaVR()));
	
		Funcionario.aumentarVR(15);
	
		System.out.println("R$"+df.format(Funcionario.consutaVR()));
		
		Funcionario.diminuirVR(10);
	
		System.out.println("R$"+df.format(Funcionario.consutaVR()));
		
		System.out.println(f1);
		System.out.println(f2);
	}
}
