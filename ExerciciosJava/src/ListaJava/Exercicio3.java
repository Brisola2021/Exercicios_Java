package ListaJava;


import java.util.Scanner;

public class Exercicio3 {

	/* 3. Faça um sistema que leia o tempo de duração de um evento
	  em uma fábrica expressa em segundos e mostre-o express
	  em horas, minutos e segundos. 
	*/  

	public static void main(String[] args)  {
		
		
		
		int N, horas, minutos, segundos;
		
		Scanner leiaa = new Scanner(System.in); {
		
		N = leiaa.nextInt();
		
		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		
		System.out.println("O tempo expresso em horas é: "+ horas);
		System.out.println("O tempo expresso em minutos é: "+ minutos);
		System.out.println("O tempo expresso em segundos é: "+ segundos);
		}
			
		
		leiaa.close();

	}

}
