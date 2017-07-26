/**
 * Pacote para armazenar classes abstratas.
 */
package classes_abstratas;
/**
 * 
 * @author Andiara
 * Classe responsável por definir a estrutura do objeto agencia.
 *
 */
public class Agencia {
	
	
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia(int numero) {
	this.numero = numero;
	}
	
	public Agencia() {

	}

}
//alt + shift + s (atalho getters and setters)