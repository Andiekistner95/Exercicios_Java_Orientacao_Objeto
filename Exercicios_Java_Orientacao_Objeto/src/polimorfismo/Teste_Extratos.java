package polimorfismo;

public class Teste_Extratos {
	public static void main(String[] args) {

		Extratos extrato = new Extratos();

		Conta_Corrente CR1 = new Conta_Corrente(2000d, 3.99d, "442");
		Cliente cliente1 = new Cliente(201, "Andiara");
		Agencia ag1 = new Agencia(123);

		CR1.setAgencia(ag1);
		CR1.setCliente(cliente1);
		CR1.setSaldo(6545d);

		extrato.extrato(CR1);

	}
}
