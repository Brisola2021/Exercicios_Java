package ListaJava;


import java.util.Scanner;

/*
 * 
 * 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner mostra = new Scanner(System.in);
		
		int idade;
		int dias;
		int mes;
		
		System.out.println("Digite Idade");
		idade = mostra.nextInt();
		
		mes = (12 * idade);
		
		dias = (365*idade);
		
		System.out.println("seu tempo de Mês é " + mes);
		
		System.out.println("Seu tempo em Dias é " + dias);
		
		System.out.println("Seu tempo em anos é " + idade);
		
				
		mostra.close();
	}

}
