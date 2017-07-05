package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Teste_Conta {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta1 = new Conta("1");
		Conta conta2 = new Conta("2");

		conta1.setSaldo(1500.00d);
		conta1.setLimite(1700.00d);

		//conta2.saldo = 1200.00d;
		//conta2.limite = 1500.00d;

		System.out.println(
				"Número conta: " + conta1.getNumero() + " Saldo conta: " + df.format(conta1.getSaldo()) + " Limite conta: " + df.format(conta1.getLimite()));

		//System.out.println(
				//"Número conta: " + conta2.numero + " Saldo conta: " + df.format(conta2.saldo) + " Limite conta: " + df.format(conta2.limite));

			conta1.transferencia(conta2, 300d);
		
		System.out.println(
				"Número conta: " + conta1.getNumero() + " Saldo conta: "+ conta1.getSaldo());

		//System.out.println(
				//"Número conta: " + conta2.numero + " Saldo conta: " + conta2.saldo);

		
	}
}
