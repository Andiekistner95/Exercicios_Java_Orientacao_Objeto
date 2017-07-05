package orientacao_a_objeto;

public class Teste_Conta_Agencia {
	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia(12);
		Conta conta1 = new Conta("32121245", ag1);

		conta1.setLimite(400.00d);
		conta1.setSaldo(320.00d);

		Conta conta2 = new Conta("38621245");
		Agencia ag2 = new Agencia(15);

		/*conta2.agencia = ag2;
		conta2.limite = 500.00d;
		conta2.saldo = 400.00d;
	    */

		// System.out.println("Agencia: " + conta1.agencia.numero +" Numero
		// conta: " + conta1.numero + " Limite: " + conta1.limite + " Saldo:
		// "+conta1.saldo );

		System.out.println(conta1.extrato());


			conta1.deposita(259.99);
			conta1.saque(325.95);
			
		System.out.println();

		System.out.println(conta1.extrato());
			
		System.out.println();

		System.out.println("Saldo: R$" + conta1.consultaSaldo());
	}
}
