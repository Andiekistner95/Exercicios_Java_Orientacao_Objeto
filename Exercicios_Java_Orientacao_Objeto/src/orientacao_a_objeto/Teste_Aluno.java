package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_Aluno {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	
	aluno1.nome = "William";
	aluno1.rg = "091456789-1";
	aluno1.dtNascimento = sdf.parse("30/03/1993");
	
	aluno2.nome = "Andiara";
	aluno2.rg = "091456789-2";
	aluno2.dtNascimento = sdf.parse("31/10/1995");
	
	System.out.println("Nome: " + aluno1.nome + " RG: " + aluno1.rg + " Data nascimento: " + sdf.format(aluno1.dtNascimento));
	
	System.out.println("Nome: " + aluno2.nome + " RG: " + aluno2.rg + " Data nascimento: " + sdf.format(aluno2.dtNascimento));
	
	
}
}
