package ExercicioLa�os;

import java.util.Scanner;

/*
 * 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles 
 * � o maior
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int soma, N;
		
		System.out.println("Digite o primeiro n�mero: \n");
		numero1 = inp.nextInt();
		
		System.out.println("Digite o segundo n�mero: \n");
		numero2 = inp.nextInt();
		
		System.out.println("Digite o terceiro n�mero: \n");
		numero3 = inp.nextInt();
		
		if (numero1 > numero2) {
			N = numero1;
		}
		else {
			N = numero2;
		}
		if (N > numero3) {
			System.out.println("O n�mero maior �:" + N);
		}
		else {
			System.out.println("O numero maior �: " + numero3);
		}
		
		
		

	}

}
