package ExerciciosLacos;

import java.util.Scanner;

/*
 * 2-	Ler 10 n�meros e 
 * imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 * 
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite a qtde de numeros a serem listados");
		int cp = entra.nextInt();
		
		int NPar = 0, NImpar = 0;
		
		for(int i = 0; i<= cp; i++) {
		System.out.println("Digite o " + (i + 1) + " numero: \n");
		int numero = entra.nextInt();
		
		if (numero % 2 ==0) {
			NPar++;
		}
		
		if (numero % 2 == 1) {
			NImpar++;
		}
		System.out.println("Os n�meros pares s�o: "+ NPar +"E os n�mero impares s�o: " + NImpar);

	}

}
}
