package ExerciciosVetoresEMatrizes;

/*
 * 
 * 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
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
			System.out.println("A média aritmética é : " + media);
			System.out.println("A maior ocorrência de valor foi : " + maior);

	}

}
