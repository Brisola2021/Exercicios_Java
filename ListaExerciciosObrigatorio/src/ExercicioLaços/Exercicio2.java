package ExercicioLaços;

import java.util.Scanner;

/*
 * 2-	Faça um programa que 
 * entre com três números e coloque em ordem crescente.
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Primeiro inteiro: ");
		n1 = ler.nextInt();
		
		System.out.println("Segundo inteiro: ");
		n2 = ler.nextInt();
		
		System.out.println("Terceiro inteiro: ");
		n3 = ler.nextInt();
		
		if (n1 < n2) {
			if(n2 < n3) {
				System.out.println(n1+"\n" +n2+"\n"+n3);
				
			}
			else if(n1 < n3) {
				System.out.println(n1+"\n" +n3+"\n"+n2);
			}
			else {
				System.out.println(n3+"\n" +n1+"\n"+n2);
			}
		}
		
		else if(n2 < n3) {
			if(n1 < n3) {
				System.out.println(n2+"\n" +n1+"\n"+n3);
			} else {
				System.out.println(n2+"\n" +n3+"\n"+n1);
			}
		}
		else {
			System.out.println(n3+"\n" +n2+"\n"+n1);
		}
		
	}

}
