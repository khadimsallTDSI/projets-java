package heritagesimple;

public class C extends B {

	public C(int a1, int a2, int a3) {
		super(a1, a2, a3);
		
	}
	private void testMethode1A() {
		System.out.println(a1);
		System.out.println(a2);
		//System.out.println(a3);
		//la variable a4 n'est pas visible car il est privé dans B
		//System.out.println(a4);
 
	}
//	public static void testMethode1B() {
//    	B obj1B=new B(2,4,6,5,7);
//    	System.out.println(obj1B);
//        
//	}
	public static void main(String[] args) {
		C.testMethode1B();
		
	}
}
  class F extends C{

	public F(int a1, int a2, int a3) {
		super(a1, a2, a3);
		
	}
	protected void testMethode1A() {
		System.out.println(a1);
		System.out.println(a2);
		//System.out.println(a5);
		//System.out.println(a3);
 
	}
	
}