package ExerciciosLacos;

/*
 * 1-	Informar todos os n�meros de 1000 a 1999 que 
 * quando divididos por 11 obtemos resto = 5. (FOR)
 */

public class Exericico1 {

	public static void main(String[] args) {
		for (int i=1000; i<2000; i++) {
			if (i%11==5) {
				System.out.println("numero dividido por 11, que tem como resto 5: \n" + i );
				
				
			}
		}

	}

}
