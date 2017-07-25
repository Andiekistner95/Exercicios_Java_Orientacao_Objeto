package interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta_Corrente extends Conta {

	private double limite;
	private double taxaJuros;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	DecimalFormat df = new DecimalFormat("#0.00");

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Conta_Corrente() {

	}

	public Conta_Corrente(double limite, double taxaJuros, String numero, double saldo) {
		super.setNumero(numero);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
		super.setSaldo(saldo);
	}

	@Override
	public void gerarExtratoDetalhado(Conta conta) {

		Date agora = new Date();

		System.out.println("\nData: " + sdf.format(agora));
		System.out.println("\nConta: " + conta.getNumero());
		System.out.println("\nAgencia: " + conta.getAgencia().getNumero());
		System.out.println("\nCliente: " + conta.getCliente().getNome());
		System.out.println("\nSaldo: R$" + df.format(conta.getSaldo()));
		System.out.println("\nLimite: R$" + df.format(limite));
		System.out.println("\nJuros: " + df.format(taxaJuros) + "%");
		System.out.println("\nSaldo disponivel: R$" + df.format(limite + conta.getSaldo()));
	}
}
