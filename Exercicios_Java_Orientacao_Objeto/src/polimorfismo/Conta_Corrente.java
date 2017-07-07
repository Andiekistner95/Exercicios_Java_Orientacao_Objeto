package polimorfismo;

import java.text.DecimalFormat;

public class Conta_Corrente extends Conta{

	private double limite;
	private double taxaJuros;
	
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
	public Conta_Corrente(double limite, double taxaJuros, String numero) {
		super.setNumero(numero);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}
	
}
