package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_CartaoDeCredito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		CartaoDeCredito mastercard = new CartaoDeCredito(4512235689787458l);
		//CartaoDeCredito visa = new CartaoDeCredito(1020364598781040l);

		mastercard.setDataValidade(sdf.parse("12/02/2028"));
		//visa.setDataValidade(dataValidade);= sdf.parse("05/07/2018");

		System.out.println("Número cartão: " + mastercard.getNumero() + " Validade Cartão: " + sdf.format(mastercard.getDataValidade()));
		//System.out.println("Número cartão: " + visa.numero + " Validade Cartão: " + sdf.format(visa.dataValidade));

	}
}