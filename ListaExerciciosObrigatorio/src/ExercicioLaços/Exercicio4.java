package ExercicioLaços;

import java.util.Scanner;

/*
 * 4-	Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 int num;
		 double raiz, potencia;
		 
		 System.out.println(" Digite um número inteiro: ");
		 num = leia.nextInt();
		 
		 if (num % 2 == 0) {
			 System.out.println("É par ");
			 raiz = Math.sqrt(num);
			 System.out.printf("Raiz quadrada: %.2f" , raiz);
		 }
		 else {
			 System.out.println("É impar: ");
			 potencia = Math.pow(num, 2);
			 System.out.println("A potencia: " + potencia);
			 
		 }

	}

}
