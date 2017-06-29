package orientacao_a_objeto;

public class Teste_Conta {
	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.numero = 1;
		conta1.saldo = 1500.00d;
		conta1.limite = 1700.00d;

		conta2.numero = 2;
		conta2.saldo = 1200.00d;
		conta2.limite = 1500.00d;

		System.out.println(
				"Número conta: " + conta1.numero + " Saldo conta: " + conta1.saldo + " Limite conta: " + conta1.limite);

		System.out.println(
				"Número conta: " + conta2.numero + " Saldo conta: " + conta2.saldo + " Limite conta: " + conta2.limite);

	}
}
