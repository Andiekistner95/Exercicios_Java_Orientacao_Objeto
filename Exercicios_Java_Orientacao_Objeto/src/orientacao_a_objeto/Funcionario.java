package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {

	String nome;
	double salario;

	void aumento(double valor) {
		this.salario += valor;
	}

	public String consultaFuncionario() {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		String funcionario = "Nome: " + this.nome + "\nSalario: R$" + df.format(this.salario);
		return funcionario;
	}
}
