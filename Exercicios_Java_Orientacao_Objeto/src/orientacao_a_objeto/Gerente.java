package orientacao_a_objeto;

public class Gerente {

	private double salario;
	private String nome;

	public void aumentoSalario() {
		this.aumentoSalario(10);
	}

	public void aumentoSalario(double valor) {
		this.salario = this.salario * ((valor / 100) + 1);
	
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
