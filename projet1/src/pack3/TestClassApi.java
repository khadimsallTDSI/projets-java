package pack3;

//import java.util.ArrayList;
import java.util.*;

public class TestClassApi {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		ArrayList l= new ArrayList();
		l.add(new Integer(2));
		l.add(2);
		Vector v = new Vector();
		v.add(new Integer(5));
		l.add(v);
		System.out.println(l);
		System.out.println(v);
	}
	
	
}
