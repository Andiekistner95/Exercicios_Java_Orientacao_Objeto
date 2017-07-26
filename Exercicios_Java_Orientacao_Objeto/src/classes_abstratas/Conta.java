package classes_abstratas;

import java.text.DecimalFormat;

/**
 * 
 * @author Andiara
 *Classe abstrata respons�vel pela defini��o da estrutura padr�o dos objetos que se estendem
 *a conta.
 */

public abstract class Conta {

	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private double saldo;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Conta() {
	
	}

	/**
	 * Contrutor completo
	 * 
	 * @param numero - n�mero da conta(tipo String)
	 * @param agencia - ag�ncia da conta (tipo Agencia)
	 * @param cliente - nome do cliente (tipo String)
	 * @param saldo - saldo da conta (tipo double)
	 */
	
	
	public Conta(String numero, Agencia agencia, Cliente cliente, double saldo) {
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	
	}
	
	/**
	 * M�todo para gerar extrato gen�rico das contas, podendo ser usado em qualquer tipo 
	 * de conta (recebe um objeto tipo Conta)
	 * 
	 * @param conta
	 */
	
	public abstract void gerarExtrato(Conta conta);
	
}
