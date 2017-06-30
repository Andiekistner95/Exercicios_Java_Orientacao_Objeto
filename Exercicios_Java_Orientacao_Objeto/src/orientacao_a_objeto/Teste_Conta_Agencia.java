package orientacao_a_objeto;

public class Teste_Conta_Agencia {
	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Agencia ag1 = new Agencia();

		conta1.agencia = ag1;
		conta1.limite = 400.00d;
		conta1.numero = "32121245";
		conta1.saldo = 320.00d;
		conta1.agencia.numero = 12;

		Conta conta2 = new Conta();
		Agencia ag2 = new Agencia();

		conta2.agencia = ag2;
		conta2.limite = 500.00d;
		conta2.numero = "38621245";
		conta2.saldo = 400.00d;
		conta2.agencia.numero = 15;

		// System.out.println("Agencia: " + conta1.agencia.numero +" Numero
		// conta: " + conta1.numero + " Limite: " + conta1.limite + " Saldo:
		// "+conta1.saldo );

		System.out.println(conta1.extrato());

		System.out.println();

			conta1.deposita(259.99);

		System.out.println();

		System.out.println(conta1.extrato());
		
			conta1.saque(325.95);
			
		System.out.println();

		System.out.println("Saldo: R$" + conta1.consultaSaldo());
	}
}
