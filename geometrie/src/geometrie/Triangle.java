package geometrie;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		/*int ligne,colonne;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrez le nombre de lignes");
		ligne=sc.nextInt();
		System.out.println("Entrez le nombre de colonnes");
		colonne=sc.nextInt();
		for(int j=1;j<=ligne;j++) {	
			
			for(int i=colonne;i>ligne-1;i--) {
				System.out.println("*");	
			}
			System.out.println("\n");
			
		}*/
		int ligne, i,j;
        System.out.println("Rentrez le nombre de lignes du triangle :\n");
        Scanner sc = new Scanner(System.in);
        ligne = sc.nextInt();
        for(i=1;i<=ligne;i++) {
            for(j=0;j<i;j++) {
             System.out.print("*");
            }
            
            System.out.println("");
             
            
            }
		

	}

}
