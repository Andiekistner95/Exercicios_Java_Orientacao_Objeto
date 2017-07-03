package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String nome;
	double salario = 1000d;

	void aumento(double valor) {
		this.salario += valor;
	}

	public String consultaFuncionario() {
		
		String funcionario = "Nome: " + this.nome + "\nSalario: R$" + df.format(this.salario);
		return funcionario;
	}
}
