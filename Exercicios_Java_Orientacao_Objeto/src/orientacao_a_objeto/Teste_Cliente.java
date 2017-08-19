package orientacao_a_objeto;

public class Teste_Cliente {
	public static void main(String[] args) {

		// criando um objeto

		Cliente cliente1 = new Cliente();
		//Cliente cliente2 = new Cliente();

		cliente1.setNome("Andiara");
		cliente1.setCodigo(1);

		//cliente2.nome = "William";
		//cliente2.codigo = 2;

		System.out.println("Cliente: " + cliente1.getNome() + " Código: " + cliente1.getCodigo());

		//System.out.println("Cliente: " + cliente2.nome + " Código: " + cliente2.codigo);
		
	}
}
