package classes_abstratas;

import java.text.DecimalFormat;

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

	public Conta(String numero, Agencia agencia, Cliente cliente, double saldo) {
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	
	}
	
	public abstract void gerarExtrato(Conta conta);
	
}
