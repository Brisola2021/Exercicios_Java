package ExerciciosVetoresEMatrizes;

/*
 * 
 * 2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);
						
		Random aleatorio = new Random();
		
		double media = 0.0, soma = 0.0;
		
		int maior = 0;
		
				
		int[] arrayVetor = new int[10];
		
			for(int i = 0; i <=9; i++) {
							
			
			 arrayVetor[i] = aleatorio.nextInt(6)+1;
			
			System.out.println(i + " - " + arrayVetor[i]);
			
			soma += arrayVetor[i];
			
			media = soma / (i+1);
			
			if (arrayVetor[i] > maior) {
				maior = arrayVetor[i];
			}
			
				
		}
			System.out.println("A m�dia aritm�tica � : " + media);
			System.out.println("A maior ocorr�ncia de valor foi : " + maior);

	}

}
