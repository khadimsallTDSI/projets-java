package pack3;

import java.util.Scanner;

public class TestSwich {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choix;
		
		do{
			System.out.println("Menu");
			System.out.println("1 calcul factoriel");
			System.out.println("2 combinaison ");
			System.out.println("3 Triangle de pascal");
			System.out.println("0 pour quitter");
			System.out.print("faites votre choix:-");
			
			System.out.println();
		     choix=sc.nextInt();
		} while (choix!=0 );
		
		
		switch (choix) {
			case 1:
				System.out.println("un");break;
			case 2:
				System.out.println("deux");
			case 3:
				System.out.println("trois");
//			case 0:
//				System.exit(0);
//			default:
//				System.out.println("Mauvaise valeur");
		}

	}

}
