package polimorfismo;

import java.text.DecimalFormat;

public class Conta_Poupanca extends Conta{

	private double taxaRendimento;
	
	DecimalFormat df = new DecimalFormat("#0.00");

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public Conta_Poupanca() {
	
	}
	
	public Conta_Poupanca(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
		
	}
	
	
	
}
