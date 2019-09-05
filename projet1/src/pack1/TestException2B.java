package pack1;

import java.util.Scanner;

public class TestException2B {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Donner x");
			int x=sc.nextInt();
			System.out.println("Donner y");
			int y=sc.nextInt();
			System.out.println(division(x, y));
//			int a=0;
//			
//			System.out.println("Donner un nombre");
//			try {
//				System.out.println("debut try");
//				a=sc.nextInt();
//				System.out.println("try apres saisi a");
//				System.out.println("a="+a);
//				System.out.println("fin try");
//				
//			} 
//			catch (Exception e) {
//				System.out.println("debut catch");
//			    e.printStackTrace();
//				System.out.println("fin catch");
//			}
//			finally {
//				System.out.println("debut finaly");
//				System.out.println("instruction execute obligatoirement");
//				System.out.println("fin finaly");
//			}
//			
//			
			//System.out.println(Math.pow(2, 31));
			
			System.out.println("fin programme");
		}
		public static int division(int a,int b) {
			//System.out.println("");
			int res=-1;
			try {
				res=a/b;
			} 
			catch (Exception e) {
			System.out.println("denominateur=0 pas bon");
			}
			return res;
		}

	}

	
	

