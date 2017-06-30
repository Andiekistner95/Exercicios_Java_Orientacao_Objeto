package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_Cliente_Cartao {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		CartaoDeCredito cdc1 = new CartaoDeCredito();
		cdc1.numero = 124578986532l;
		cdc1.dataValidade = sdf.parse("12/02/2019");
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "William";
		cliente1.codigo = 1;

		cdc1.cliente = cliente1;
		
		
		System.out.println("Nome: " + cdc1.cliente.nome + " Codigo: " + cdc1.cliente.codigo + " Cartao numero: "
				+ cdc1.numero + " Data validade: " + sdf.format(cdc1.dataValidade));

	}
}
