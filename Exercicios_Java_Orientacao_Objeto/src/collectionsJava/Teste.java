package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {

		List contaCorrente = new ArrayList();
		List contaPoupanca = new ArrayList();
		
		Agencia ag1 = new Agencia(12);
	
		Cliente cliente1 = new Cliente(454, "Andiara");
		
		Conta_Corrente cc1 = new Conta_Corrente(1200.99, 0.10, "1522", 4512.00);
		cc1.setAgencia(ag1);
		cc1.setCliente(cliente1);
		
		Conta_Poupanca cp1 = new Conta_Poupanca(12.2);
		cp1.setAgencia(ag1);
		cp1.setCliente(cliente1);
		
		contaCorrente.add(cc1);
		contaPoupanca.add(cp1);
		
		System.out.println("Conta corrente");
		GeradorExtrato.gerarExtrato(cc1);
		//cc1.gerarExtratoDetalhado(cc1);
	}
}
