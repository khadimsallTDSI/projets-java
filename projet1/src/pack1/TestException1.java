package pack1;

import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
try {
		division2();
	}
	catch (Exception e) {
		System.out.println("Division par 0 impossible");
	}
	
	
		division(sc);
		System.out.println("Fin programme");
	}
 public static double racine(int x) {
	 
	 
	 return Math.sqrt(x);
 }
 public static  void division(Scanner sc) {
	// Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
		System.out.println(racine(x));
		System.out.println("Division de deux nombre");
		System.out.println("entrez le numerateur");
		int a=sc.nextInt();
		System.out.println("entrez le denominateur");
		int b=sc.nextInt();
		try {
			System.out.println(a+"/"+b+ " "+a/b);
		}
		catch (Exception e) {
			System.out.println("Division par 0 impossible");
		}
		
		System.out.println("Fin programme");
 }
 
 public static  void division2() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		 int x=sc.nextInt();
			System.out.println(racine(x));
			System.out.println("Division de deux nombre");
			System.out.println("entrez le numerateur");
			int a=sc.nextInt();
			System.out.println("entrez le denominateur");
			int b=sc.nextInt();
			
			System.out.println("Fin programme");
	 }
}
