package pack1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException2C {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				CompteException c1=new CompteException();
				
				int x=0,y=0;
				try {
					System.out.println("Donner x");
					x=sc.nextInt();
					System.out.println("Donner y");
					 y=sc.nextInt();
				}
				catch (InputMismatchException e) {
					System.out.println("mauvais type d'arguments x et y ");
				}
				
				try {
					System.out.println(division(x, y));	
				} 
				catch (ArithmeticException e) {
					System.out.println("division impossible");
				}
						
				System.out.println("fin programme");
			}
			public static int division(int a,int b) throws ArithmeticException{
			
				//System.out.println("");
				
				return a/b;
			}

		}

		
		




