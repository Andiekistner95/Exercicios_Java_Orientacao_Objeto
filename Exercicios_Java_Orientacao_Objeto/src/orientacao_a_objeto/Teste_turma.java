package orientacao_a_objeto;

public class Teste_turma {
	public static void main(String[] args) {

		Turma turma1 = new Turma();
		Turma turma2 = new Turma();

		turma1.periodo = 'm';
		turma1.serie = 8;
		turma1.sigla = "8-1";
		turma1.ensino = "Fundamental";

		turma2.periodo = 'v';
		turma2.serie = 4;
		turma2.sigla = "4-1";
		turma2.ensino = "Fundamental";

		System.out.println(
				turma1.ensino + " Serie: " + turma1.serie + " Sigla: " + turma1.sigla + " Periodo: " + turma1.periodo);
		System.out.println(
				turma2.ensino + " Serie: " + turma2.serie + " Sigla: " + turma2.sigla + " Periodo: " + turma2.periodo);
	}
}
