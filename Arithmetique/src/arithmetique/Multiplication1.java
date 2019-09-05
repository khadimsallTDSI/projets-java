package arithmetique;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication1 {

	public static void main(String[] args) {
		int mult;
		System.out.println("-------------------------");
		System.out.println("Multiplication");
		System.out.println("-------------------------");
		Scanner sc=new Scanner(System.in);
		//Tableau dynamique d'entier qui a pour nom mul et qu utilise
		//java Wrapper Class tel String,Boolean,Integer,Double......
		 //ArrayList<Integer> mul = new ArrayList<Integer>();
		System.out.println("entrer un entier positif");
		mult=sc.nextInt();
		for(int i=1;i<=mult;i++) {
			System.out.println("_______________________________________");
			System.out.println("La table de multiplication de: "+i);
			System.out.println("_______________________________________");
			for(int j=1;j<=10;j++ ) {
				System.out.println(i+"x"+j+"="+j*i);
				//mul.add(i);
				//System.out.println(mul);
			
			}
			
		
		}
       
	}

}
