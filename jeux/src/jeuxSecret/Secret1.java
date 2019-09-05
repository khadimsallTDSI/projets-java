package jeuxSecret;

import java.util.Random;
import java.util.Scanner;

public class Secret1 {
	static int a;
	static int cpt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ici je ne connais pas le nombre secret
		Random r = new Random();
		int secret = r.nextInt(20)+1;
		int cpt=1;
		do {
		
				System.out.println("entrer le nombre secret entre 0 et 20 ");
				a = sc.nextInt();
				if (a < secret) {
					System.out.println("Entrez un nombre superieur");
				}
				if (a > secret) {
					System.out.println("Entrez un nombre inferieur");
				
				}
				if (a < 0)
					System.out.println("le programme n'accepte pas les nombres negatif");
				    
				if(a==secret){ System.out.println("Bravo vous avez trouve le nombre secret en: " + cpt + "coups");
				 System.exit(0);
				 
				}
				cpt++;
				
			
			
		} while (a < 0 || a != secret);

	}

}
