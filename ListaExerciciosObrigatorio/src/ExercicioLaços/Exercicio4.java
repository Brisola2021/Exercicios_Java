package ExercicioLa�os;

import java.util.Scanner;

/*
 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 int num;
		 double raiz, potencia;
		 
		 System.out.println(" Digite um n�mero inteiro: ");
		 num = leia.nextInt();
		 
		 if (num % 2 == 0) {
			 System.out.println("� par ");
			 raiz = Math.sqrt(num);
			 System.out.printf("Raiz quadrada: %.2f" , raiz);
		 }
		 else {
			 System.out.println("� impar: ");
			 potencia = Math.pow(num, 2);
			 System.out.println("A potencia: " + potencia);
			 
		 }

	}

}
