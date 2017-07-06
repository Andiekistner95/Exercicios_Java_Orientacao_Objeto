package heranca;
public class Telefonista extends Funcionario {

	private int codEstacaoTrabalho;

	public Telefonista() {

	}

	public Telefonista(int codEstacaoTrabalho) {
		this.codEstacaoTrabalho = codEstacaoTrabalho;

	}

	public int getCodEstacaoTrabalho() {
		return codEstacaoTrabalho;
	}

	public void setCodEstacaoTrabalho(int codEstacaoTrabalho) {
		this.codEstacaoTrabalho = codEstacaoTrabalho;
	}
}
