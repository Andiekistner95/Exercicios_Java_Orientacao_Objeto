package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Conta {

	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saque(double valor) {
		this.saldo -= valor;

	}

	public double consultaSaldo() {
		return this.saldo + this.limite;

	}

	public String extrato() {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		String extrato = "Numero conta: " + this.numero + "\nSaldo: R$" + df.format(this.saldo) + "\nLimite: R$" + df.format(this.limite)
				+ "\nAgencia: " + this.agencia.numero;
		return extrato;
	}

}
