package arithmetique;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		int mult;
		System.out.println("-------------------------");
		System.out.println("Multiplication");
		System.out.println("-------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer un entier positif");
		mult=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+mult+"="+i*mult);
		}
	}

}
