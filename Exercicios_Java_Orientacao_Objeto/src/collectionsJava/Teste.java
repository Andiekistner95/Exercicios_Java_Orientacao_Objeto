package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {

		/**
		 * Utilização do conceito Generics,representado pelo tipo Lista entre
		 * "<>" conforme exemplo abaixo, a lista possui objetos do tipo
		 * conta_Corrente
		 * 
		 * List<Conta_Corrente> contaCorrente = new ArrayList<Conta_Corrente>();
		 */

		List<Conta_Corrente> contaCorrente = new ArrayList<Conta_Corrente>();
		List<Conta_Poupanca> contaPoupanca = new ArrayList<Conta_Poupanca>();

		Agencia ag1 = new Agencia(12);

		Cliente cliente1 = new Cliente(454, "Andiara");

		Conta_Corrente cc1 = new Conta_Corrente(1200.99, 0.10, "1522", 4512.00);
		cc1.setAgencia(ag1);
		cc1.setCliente(cliente1);

		Conta_Corrente cc2 = new Conta_Corrente(1222.99, 0.09, "1856", 4966.00);
		cc2.setAgencia(ag1);
		cc2.setCliente(cliente1);

		Conta_Corrente cc3 = new Conta_Corrente(1333.99, 0.11, "1425", 4741.00);
		cc3.setAgencia(ag1);
		cc3.setCliente(cliente1);

		Conta_Poupanca cp1 = new Conta_Poupanca(12.5, 200.45, "55");
		cp1.setAgencia(ag1);
		cp1.setCliente(cliente1);

		Conta_Poupanca cp2 = new Conta_Poupanca(12.2, 300.85, "45");
		cp2.setAgencia(ag1);
		cp2.setCliente(cliente1);

		Conta_Poupanca cp3 = new Conta_Poupanca(12.3, 400.65, "78");
		cp3.setAgencia(ag1);
		cp3.setCliente(cliente1);

		contaCorrente.add(cc1);
		contaCorrente.add(cc2);
		contaCorrente.add(cc3);

		contaPoupanca.add(cp1);
		contaPoupanca.add(cp2);
		contaPoupanca.add(cp3);

		for (Conta_Corrente conta_Corrente : contaCorrente) {
			System.out.println(conta_Corrente.getSaldo());
		}

		System.out.println("Conta corrente");
		GeradorExtrato.gerarExtrato(cc1);
		// cc1.gerarExtratoDetalhado(cc1);

		System.out.println();
		System.out.println("Tamanho da lista de conta corrente: " + contaCorrente.size());
		System.out.println("Tamanho da lista de conta poupança: " + contaPoupanca.size());

		contaCorrente.remove(cc1);
		contaCorrente.remove(1);

		contaPoupanca.remove(cp1);
		contaPoupanca.remove(0);

		System.out.println("Tamanho da lista de conta corrente: " + contaCorrente.size());
		System.out.println("Tamanho da lista de conta poupança: " + contaPoupanca.size());

		for (Conta_Poupanca poupanca : contaPoupanca) {
			poupanca.gerarExtratoDetalhado(poupanca);
		}

		for (Conta_Corrente corrente : contaCorrente) {
			corrente.gerarExtratoDetalhado(corrente);

		}

		contaCorrente.clear();
		contaPoupanca.clear();

		System.out.println("Tamanho da lista de conta corrente: " + contaCorrente.size());
		System.out.println("Tamanho da lista de conta poupança: " + contaPoupanca.size());

	}
}
