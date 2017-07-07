package polimorfismo;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String nome;
	private double salario;
	private double bonificacao;
	
	// Construtor padrao
	public Funcionario() {

	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double taxa){
		this.salario = salario*((taxa/100)+1);
		
	}
	
	public void calculoBonificacao(){
		this.bonificacao = salario*0.05;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public String mostrarDados(){
		String dados;
				dados = "Nome: " + this.getNome(); 
				dados += "\nSalário: R$" + df.format(this.getSalario()); 
				dados += "\nBonificação: R$" +df.format(this.getBonificacao());
				return dados;
	}
}
