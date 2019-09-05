package pack1;

import java.io.*;
import java.sql.SQLException;

public class AException {
	public void methode1() throws Exception {
		throw new Exception();

	}

	public static void methode2() throws FileNotFoundException,IOException {
		//throw new FileNotFoundException();
		

	}

	public static void methode3() {

		throw new NullPointerException();

	}

	public static void methode4(int a,int b) throws  SQLException {
		try {
			throw new IOException();
		} catch (Exception e) {
			
		}
		
		System.out.println(a/b); 
		throw new SQLException();
	}
	
}
