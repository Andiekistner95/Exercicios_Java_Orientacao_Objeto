package classes_abstratas;
public class Gerente extends Funcionario {

	private String usuario;
	private String senha;

	public Gerente() {

	}

	public Gerente(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/*@Override
	public void calculoBonificacao() {
		setBonificacao(getSalario()*0.10);
	}*/
	@Override
	public String mostrarDados() {
		return super.mostrarDados() + "\nUsu�rio: " + getUsuario() + "\nSenha: " + getSenha();
	}

	@Override
	public void calculoBonificacao() {
		setBonificacao(getSalario()*0.20);		
	}			
}
