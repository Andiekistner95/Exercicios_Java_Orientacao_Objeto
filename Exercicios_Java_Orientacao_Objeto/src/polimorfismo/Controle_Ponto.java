package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controle_Ponto {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registroEntrada(Funcionario funcionario){
		
		Date agora = new Date();
		
		System.out.println("Nome: "+funcionario.getNome() + 
							"\nHorário de entrada: " + sdf.format(agora));
	}
	
public void registroSaida(Funcionario funcionario){
		
		Date agora = new Date();
		
		System.out.println("Nome: "+funcionario.getNome() + 
							"\nHorário de saida: " + sdf.format(agora));
	}
}
