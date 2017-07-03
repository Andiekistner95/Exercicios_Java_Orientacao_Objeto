package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Teste_Conta {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta1 = new Conta("1");
		Conta conta2 = new Conta("2");

		conta1.saldo = 1500.00d;
		conta1.limite = 1700.00d;

		conta2.saldo = 1200.00d;
		conta2.limite = 1500.00d;

		System.out.println(
				"Número conta: " + conta1.numero + " Saldo conta: " + df.format(conta1.saldo) + " Limite conta: " + df.format(conta1.limite));

		System.out.println(
				"Número conta: " + conta2.numero + " Saldo conta: " + df.format(conta2.saldo) + " Limite conta: " + df.format(conta2.limite));

			conta1.transferencia(conta2, 300d);
		
		System.out.println(
				"Número conta: " + conta1.numero + " Saldo conta: "+ conta1.saldo);

		System.out.println(
				"Número conta: " + conta2.numero + " Saldo conta: " + conta2.saldo);

		
	}
}
