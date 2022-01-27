package ExercicioLaços;

import java.util.Scanner;

/*
 * 1-	Faça um programa que receba três inteiros e diga qual deles 
 * é o maior
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int soma, N;
		
		System.out.println("Digite o primeiro número: \n");
		numero1 = inp.nextInt();
		
		System.out.println("Digite o segundo número: \n");
		numero2 = inp.nextInt();
		
		System.out.println("Digite o terceiro número: \n");
		numero3 = inp.nextInt();
		
		if (numero1 > numero2) {
			N = numero1;
		}
		else {
			N = numero2;
		}
		if (N > numero3) {
			System.out.println("O número maior é:" + N);
		}
		else {
			System.out.println("O numero maior é: " + numero3);
		}
		
		
		

	}

}
