package pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
	public static void main(String[] args) {
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Donner un nombre");
		try {
			System.out.println("debut try");
			a=sc.nextInt();
			System.out.println("try apres saisi a");
			System.out.println("a="+a);
			System.out.println("fin try");
			
		} 
		catch (InputMismatchException e) {
			System.out.println("debut catch");
		    e.printStackTrace();
			System.out.println("fin catch");
		}
		finally {
			System.out.println("debut finaly");
			System.out.println("instruction execute obligatoirement");
			System.out.println("fin finaly");
		}
		
		
		//System.out.println(Math.pow(2, 31));
		
		System.out.println("fin programme");
	}

}
