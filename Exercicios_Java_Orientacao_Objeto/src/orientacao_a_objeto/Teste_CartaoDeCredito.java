package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_CartaoDeCredito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		CartaoDeCredito mastercard = new CartaoDeCredito(4512235689787458l);
		CartaoDeCredito visa = new CartaoDeCredito(1020364598781040l);

		mastercard.dataValidade = sdf.parse("12/02/2028");
		visa.dataValidade = sdf.parse("05/07/2018");

		System.out.println("N�mero cart�o: " + mastercard.numero + " Validade Cart�o: " + sdf.format(mastercard.dataValidade));
		System.out.println("N�mero cart�o: " + visa.numero + " Validade Cart�o: " + sdf.format(visa.dataValidade));

	}
}