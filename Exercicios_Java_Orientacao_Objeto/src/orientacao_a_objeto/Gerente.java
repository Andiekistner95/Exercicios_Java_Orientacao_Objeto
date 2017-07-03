package orientacao_a_objeto;

public class Gerente {

	double salario;
	String nome;

	public void aumentoSalario() {
		this.aumentoSalario(10);
	}

	public void aumentoSalario(double valor) {
		this.salario = this.salario * ((valor / 100) + 1);
	}
}
