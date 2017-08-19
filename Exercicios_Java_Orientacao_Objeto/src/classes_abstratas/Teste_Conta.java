package classes_abstratas;

public class Teste_Conta {
public static void main(String[] args) {
	
	Conta_Corrente cc = new Conta_Corrente(1250d, 4.5d, "69");
	Conta_Poupanca cp = new Conta_Poupanca(4.5d);
	
	Agencia ag = new Agencia(12);
	Cliente cliente = new Cliente(45, "William");
	
	System.out.println(cc);
	System.out.println(cp);
	System.out.println(ag);
	System.out.println(cliente);//tudo desnecessario,só pra sumir o erro
	
}
}
