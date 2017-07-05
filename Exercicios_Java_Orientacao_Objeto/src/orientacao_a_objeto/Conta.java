package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Conta {

	private String numero;
	private double saldo;
	private double limite = 100d;
	private Agencia agencia;
	public static int contasCriadas;
	private int idConta;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor;

	}

	public double consultaSaldo() {
		return this.saldo + this.limite;

	}

	public String extrato() {
		DecimalFormat df = new DecimalFormat("#0.00");

		String extrato = "Numero conta: " + this.numero;
		extrato += "\nSaldo: R$" + df.format(this.saldo);
		extrato += "\nLimite: R$" + df.format(this.limite);
		extrato += "\nAgencia: " + this.agencia.getNumero();
		return extrato;
	}
	//Construtor da conta. Utilizando numero como parametro
	public Conta(String numero) {
		this.numero = numero;
		this.contagemContas();
	}
	//Construtor da conta. Utilizando numero  e agencia como parametro
	public Conta(String numero,Agencia agencia) {
		this(numero);
		this.agencia = agencia;
		this.contagemContas();
	}
	
	public void transferencia(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	//incrementa a quantidade de contas criadas a cada instancia de objeto
	public void contagemContas(){
		this.contasCriadas += 1;
		this.idConta = contasCriadas;
	}
	//retorna a qnt total de contas criadas pela classe
	public static int totalContas(){
		return contasCriadas;
	}
	//retorna o id da conta(tipo codigo unico em SQL)
	public int consultaId(){
		return this.idConta;
	}
	public static void zerarContador(){
		System.out.println(Conta.contasCriadas);
	Conta.contasCriadas = 0;
	}
}
