package heranca;

import java.text.DecimalFormat;

public class Teste_Heranca {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Gerente g1 = new Gerente();
		g1.setNome("William");
		g1.setSalario(4500.00d);
		g1.setSenha("3010");
		g1.setUsuario("wgm");

		Telefonista t1 = new Telefonista();
		t1.setNome("Andiara");
		t1.setSalario(2100.00d);
		t1.setCodEstacaoTrabalho(123);

		Secretaria s1 = new Secretaria();
		s1.setNome("Simone");
		s1.setSalario(2300.00d);
		s1.setNumRamal("357");

		System.out.println("Gerente: R$"+df.format(g1.getSalario()) +"\nSecretaria: R$"+ df.format(s1.getSalario()) +"\nTelefonista: R$" + df.format(t1.getSalario()));
		
		g1.aumentoSalario(15);
		t1.aumentoSalario(20);
		s1.aumentoSalario(25);
		
		System.out.println();
		
		System.out.println("Gerente: R$"+df.format(g1.getSalario()) +"\nSecretaria: R$"+ df.format(s1.getSalario()) +"\nTelefonista: R$" + df.format(t1.getSalario()));
		
		s1.calculoBonificacao();
		t1.calculoBonificacao();
		g1.calculoBonificacao();
		
		System.out.println();
		
		System.out.println("Gerente: R$"+df.format(g1.getBonificacao()));

		System.out.println();
		
		g1.mostrarDados();
		s1.mostrarDados();
		t1.mostrarDados();
		
	}
}
