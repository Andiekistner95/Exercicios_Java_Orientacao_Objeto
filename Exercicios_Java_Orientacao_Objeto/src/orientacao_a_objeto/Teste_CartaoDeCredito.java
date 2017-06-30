package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_CartaoDeCredito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		CartaoDeCredito mastercard = new CartaoDeCredito();
		CartaoDeCredito visa = new CartaoDeCredito();

		mastercard.numero = 4512235689787458l;
		mastercard.dataValidade = sdf.parse("12/02/2028");

		visa.numero = 1020364598781040l;
		visa.dataValidade = sdf.parse("05/07/2018");

		System.out.println("N�mero cart�o: " + mastercard.numero + " Validade Cart�o: " + sdf.format(mastercard.dataValidade));
		System.out.println("N�mero cart�o: " + visa.numero + " Validade Cart�o: " + sdf.format(visa.dataValidade));

	}
}