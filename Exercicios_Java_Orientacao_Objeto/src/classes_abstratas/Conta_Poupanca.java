package classes_abstratas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta_Poupanca extends Conta{

	private double taxaRendimento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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

	@Override
	public void gerarExtrato(Conta conta) {
		// TODO Auto-generated method stub
		
		Date agora = new Date();

		System.out.println("\nData: " + sdf.format(agora));
		System.out.println("\nConta: " + conta.getNumero());
		System.out.println("\nAgencia: " + conta.getAgencia().getNumero());
		System.out.println("\nCliente: " + conta.getCliente().getNome());
		System.out.println("\nSaldo: R$" + df.format(conta.getSaldo()));
		System.out.println("\nTaxa Rendimento: " + df.format(taxaRendimento) + "%");
	}
	
	
	
}
