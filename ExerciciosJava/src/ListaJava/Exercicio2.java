package ListaJava;


import java.util.Scanner;

/*
 * 
 * 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner mostra = new Scanner(System.in);
		
		int idade = mostra.nextInt();
		int dias = mostra.nextInt();
		int mes = mostra.nextInt();
		
		System.out.println("Idade"+ idade);
		
		mes = (12 * idade);
		
		System.out.println("Mês" + mes);
		
		dias = (365*idade);
		
		System.out.println("Dias" + dias);
				
		mostra.close();
	}

}
