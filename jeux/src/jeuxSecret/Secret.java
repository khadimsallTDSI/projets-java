package jeuxSecret;

import java.util.*;

public class Secret {
	static int a, compteur = 0;
	// Ici je connais le nombre secret
	static int secret = 2;
	static int tentative=5;
   // static int choix;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 // Create a HashMap object called capitalCities
	    HashMap<String, Integer> score = new HashMap<String, Integer>();

	    // Add keys and values (Country, City)
	    /*capitalCities.put("England", 12);
	    capitalCities.put("Germany", 13);
	    capitalCities.put("Norway", 14);
	    capitalCities.put("USA", 15);
	    System.out.println(capitalCities); */
	    System.out.println("Veuillez entrer votre nom");
	    String nom=sc.nextLine();
	    System.out.println("Veuille entrer votre mot de passe");
	    int pass=sc.nextInt();
	    System.out.println("Bienvenu "+nom+" dans le jeux secret votre mot de passe pour continuer");
	   int pass2=sc.nextInt();
	   score.put(nom, pass);
	   if(pass==pass2) {
		do {
			System.out.println("entrer le nombre secret entre 0 et 100 ");
			a = sc.nextInt();
			if (a == secret) {
				compteur++;
				System.out.println("Bravo vous avez trouve le nombre secret en: " + compteur + "coups");
               break;
			}
			if (a >= 0 && a <= 100) {
				if (a < secret)
					System.out.println("Le nombre est inferieur au nombre secret ");

				if (a > secret)
         		System.out.println("le nombre est superieur au nombre secret");
				compteur++;
			}
			else {
				
               System.out.println("le nombre doit compris entre 0 et 100");
               compteur++;
			}

			
			if(compteur==tentative) {
				System.out.println("desolé Vous avez atteint le nombre de tentatives ");
				System.exit(0);
			}
		} while (a != secret);
		//faire un menu de telle sorte que le programme termine 
		//en fonction de l'utilisateur
	    }else {
	    	System.out.println("!!!Mot de passe incorrect");
	    }
	   score.put(nom,compteur);
	   System.out.println("Statistiques "+score);
	}
}
