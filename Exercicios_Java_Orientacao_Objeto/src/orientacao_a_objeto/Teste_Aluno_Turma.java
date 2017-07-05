package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_Aluno_Turma {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		Aluno aluno1 = new Aluno();
		aluno1.setNome("William");
		aluno1.setRg("0216565949-2");;
		aluno1.setDtNascimento(sdf.parse("30/03/1995"));

		Turma turma1 = new Turma();
		turma1.setSerie(8);
		turma1.setEnsino("Médio");
		turma1.setSigla("8-1");
		turma1.setPeriodo('n');

		aluno1.setTurma(turma1);
		
		System.out.println("Nome: " + aluno1.getNome() + 
				" \nRg: " + aluno1.getRg() + 
				" \nDt Nascimento: " + sdf.format(aluno1.getDtNascimento()) + 
				" \nSerie: " + turma1.getSerie() +
				" \nEnsino: " + turma1.getEnsino() +
				" \nSigla: " + turma1.getSigla() +
				" \nPeriodo: " + turma1.getPeriodo());
	
		/*Aluno aluno1 = new Aluno();
		aluno1.nome = "William";
		aluno1.rg = "0216565949-2";
		aluno1.dtNascimento = sdf.parse("30/03/1995");

		Turma turma1 = new Turma();
		turma1.serie = 8;
		turma1.ensino = "Médio";
		turma1.sigla = "8-1";
		turma1.periodo = 'n';

		aluno1.turma = turma1;
		
		System.out.println("Nome: " + aluno1.nome + 
				" \nRg: " + aluno1.rg + 
				" \nDt Nascimento: " + sdf.format(aluno1.dtNascimento) + 
				" \nSerie: " + turma1.serie +
				" \nEnsino: " + turma1.ensino +
				" \nSigla: " + turma1.sigla +
				" \nPeriodo: " + turma1.periodo);*/
	
	}

}
