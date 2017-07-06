package heranca;
public class Secretaria extends Funcionario {

	private String numRamal;
	
	public Secretaria(){
		
	}
	public Secretaria(String numRamal){
		this.numRamal = numRamal;
	}

	public String getNumRamal() {
		return numRamal;
	}

	public void setNumRamal(String numRamal) {
		this.numRamal = numRamal;
	}
}
