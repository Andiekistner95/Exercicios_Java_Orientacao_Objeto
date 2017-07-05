package estatico;

import orientacao_a_objeto.Conta;

public class Classe_Conta {
	public static void main(String[] args) {

		System.out.println(Conta.totalContas());
		
		Conta c1 = new Conta("2121212");
		Conta c2 = new Conta("3691212");

		System.out.println("Conta 1 id: "+ c1.consultaId());
		System.out.println("Conta 2 id: "+ c2.consultaId());
		System.out.println(Conta.totalContas());
		Conta.zerarContador();
		System.out.println(Conta.totalContas());
		
	}
}
