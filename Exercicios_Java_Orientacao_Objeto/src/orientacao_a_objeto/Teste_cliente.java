package orientacao_a_objeto;

public class Teste_cliente {
	public static void main(String[] args) {

		// criando um objeto

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.nome = "Andiara";
		cliente1.codigo = 1;

		cliente2.nome = "William";
		cliente2.codigo = 2;

		System.out.println("Cliente: " + cliente1.nome + " Código: " + cliente1.codigo);

		System.out.println("Cliente: " + cliente2.nome + " Código: " + cliente2.codigo);
		
	}
}
