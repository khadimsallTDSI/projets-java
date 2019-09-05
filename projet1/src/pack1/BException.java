package pack1;

import java.io.*;
public class BException  {
	public static void main(String[] args) {
		
		try {
			testMethodeAException();
		} catch (Exception e) {
			
		}
		try {
			AException.methode2();
			
		} 
		catch (FileNotFoundException e) {
			
		}
		catch (IOException e) {
			
		}
		
			AException.methode3();
		
		
	}
	public static void testMethodeAException() throws Exception {
		AException a1=new AException();
		a1.methode1();
	}
}
