package orientacao_a_objeto;

import java.util.Date;

public class CartaoDeCredito {

		long numero;
		Date dataValidade;
		Cliente cliente;
		
		public CartaoDeCredito(long numero) {
			this.numero = numero;
		}
}
