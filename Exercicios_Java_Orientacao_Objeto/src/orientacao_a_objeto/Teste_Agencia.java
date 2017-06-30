package orientacao_a_objeto;

public class Teste_Agencia {
	public static void main(String[] args) {

		Agencia ag1 = new Agencia();
		ag1.numero = 3012;

		Agencia ag2 = new Agencia();
		ag2.numero = 3013;
		
		System.out.println("Agencia número: " + ag1.numero);
		
		System.out.println("Agencia número: " + ag2.numero);
		

	}
}
