package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Conta {

	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor;

	}

	public double consultaSaldo() {
		return this.saldo + this.limite;

	}

	public String extrato() {
		DecimalFormat df = new DecimalFormat("#0.00");

		String extrato = "Numero conta: " + this.numero;
		extrato += "\nSaldo: R$" + df.format(this.saldo);
		extrato += "\nLimite: R$" + df.format(this.limite);
		extrato += "\nAgencia: " + this.agencia.numero;
		return extrato;
	}

}
