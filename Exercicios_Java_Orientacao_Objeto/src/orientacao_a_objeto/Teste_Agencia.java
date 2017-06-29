package orientacao_a_objeto;

public class Teste_Agencia {
	public static void main(String[] args) {

		Agencia ag1 = new Agencia();
		ag1.nome = "Velha";
		ag1.numero = 3012;

		Agencia ag2 = new Agencia();
		ag2.nome = "Garcia";
		ag2.numero = 3013;

		Agencia ag3 = new Agencia();
		ag3.nome = "Fortaleza";
		ag3.numero = 3014;
		
		System.out.println(ag1.nome + " " + ag1.numero);
		
		System.out.println(ag2.nome + " " + ag2.numero);
		
		System.out.println(ag3.nome + " " + ag3.numero);

	}
}
