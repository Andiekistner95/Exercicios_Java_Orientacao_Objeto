package polimorfismo;

public class Teste_Controle_Ponto {
	public static void main(String[] args) {

		Gerente g1 = new Gerente("wtf", "5454");
		Controle_Ponto cp = new Controle_Ponto();

		g1.setNome("Andiara");
		g1.setSalario(2500d);
		g1.setBonificacao(250d);

		cp.registroEntrada(g1);
		cp.registroSaida(g1);
		
		Telefonista t1 = new Telefonista(123);
		
		t1.setNome("William");
		t1.setSalario(1000d);
		t1.setBonificacao(100d);
		
		System.out.println();
		
		cp.registroEntrada(t1);
		cp.registroSaida(t1);
	}
}
