package orientacao_a_objeto;

public class Teste_CartaoDeCredito {
	public static void main(String[] args) {

		CartaoDeCredito mastercard = new CartaoDeCredito();
		CartaoDeCredito visa = new CartaoDeCredito();

		mastercard.numero = 4512235689787458l;
		mastercard.dataValidade = "12/28";

		visa.numero = 1020364598781040l;
		visa.dataValidade = "05/18";

		System.out.println("N�mero cart�o: " + mastercard.numero + " Validade Cart�o: " + mastercard.dataValidade);
		System.out.println("N�mero cart�o: " + visa.numero + " Validade Cart�o: " + visa.dataValidade);

	}
}