package orientacao_a_objeto;

public class Teste_turma {
	public static void main(String[] args) {

		Turma turma1 = new Turma();
		//Turma turma2 = new Turma();

		turma1.setPeriodo('m');
		turma1.setSerie(8);
		turma1.setSigla("8-1");
		turma1.setEnsino("Fundamental");

		/*turma2.periodo = 'v';
		turma2.serie = 4;
		turma2.sigla = "4-1";
		turma2.ensino = "Fundamental";*/

		System.out.println(
				turma1.getEnsino() + " Serie: " + turma1.getSerie() + " Sigla: " + turma1.getSigla() + " Periodo: " + turma1.getPeriodo());
		/*System.out.println(
				turma2.ensino + " Serie: " + turma2.serie + " Sigla: " + turma2.sigla + " Periodo: " + turma2.periodo);
	*/
	}
}
