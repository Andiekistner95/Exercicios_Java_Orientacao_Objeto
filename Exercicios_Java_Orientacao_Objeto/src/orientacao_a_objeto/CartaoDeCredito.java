package orientacao_a_objeto;

import java.util.Date;

public class CartaoDeCredito {

	private long numero;
	private Date dataValidade;
	private Cliente cliente;
		
		public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

		public CartaoDeCredito(long numero) {
			this.numero = numero;
		}
}
