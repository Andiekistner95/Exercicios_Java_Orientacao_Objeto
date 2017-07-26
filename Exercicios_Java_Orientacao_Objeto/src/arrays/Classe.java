/**
 * Pacote criado para armazenar a classe referente a array.
 */
package arrays;

import java.util.Arrays;

/**
 * 
 * @author Andiara
 * Classe utilizada para realizar os testes com arrays.
 *
 */
public class Classe {
	
	public static void main(String[] args) {

		int[] numeros = new int[] { 5, 10, 15, 20, 25, 30, 35, 0 };

		for (int num : numeros) {
			System.out.print(num + " ");

		}
		System.out.println();

		String[] nome = new String[] { "Alison", "Alicia", "Alana", "Andiara" };

		Arrays.sort(nome);

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}

		int[] numeros2 = new int[10];
		double soma = 0;

		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = i * 5;
			soma += numeros2[i];

		}
		double media = (soma / numeros2.length);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

		int[] numeros3 = new int[] { 15, 25, 98, 74, 32, 14, 552, 61 };

		Arrays.sort(numeros3);

		int max = numeros3[numeros3.length - 1];

		System.out.println("Maior numero: " + max);
	}

}