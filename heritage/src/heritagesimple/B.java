package heritagesimple;
public class B extends A{
	protected int b1;
	protected int b2;
	private int a4=10;
	
	public B(int a1, int a2, int a3) {
		super(a1, a2, a3);
		
	}
	public B(int a1, int a2, int a3,int b1,int b2) {
		super(a1, a2, a3);
		this.b1=b1;
		this.b2=b2;
	}
	private void testMethode1A() {
		System.out.println(a1);
		System.out.println(a2);
		//System.out.println(a3);
		System.out.println(a4);
 
	}
	protected void testMethode2A() {
   
	}
    static void testMethode1B() {
    	B obj1B=new B(2,4,6,5,7);
    	System.out.println(obj1B);
    	System.out.println(a5);
	}
    public String toString() {
		return "B [a1=" + a1 + ", a2=" + a2 + ", a4=" + a4 +  ", b1=" + b1 + ", b2=" + b2 +"+ a5 ="+a5+"]";
	}
    protected void afficheObjetA() {
        System.out.println("B [a1=" + a1 + ", a2=" + a2 + ", a4=" + a4 + "]");
  	}
	
	public static void main(String[] args) {
//		A obj1A=new A(2,4,6);
//		System.out.println(obj1A.a1);
//		System.out.println(obj1A.a2);
//		//System.out.println(obj1A.a3);
//		System.out.println(obj1A.a4);
//		testMethode1B();
//		A obj2A=new A(2,4,6);
//		System.out.println(obj1A.a4);
		A obj6A=new A(2,4,6);
		obj6A.afficheObjetA();
		System.out.println(obj6A.m1A());
		//System.out.println(obj6A.m6A());
		
		System.out.println(obj6A.toString());
		B obj2B=new B(2,4,6,5,7);
    	obj2B.afficheObjetA();
    	System.out.println("----------------");
    	A obj4A=new B(2,4,6,20,30);
		obj4A.afficheObjetA();

		//A obj3A=new B(2,4,6);
//		System.out.println(obj3A.toString());
				
//    	A obj5A=new B(2,4,6,20,30);
//		obj5A.afficheObjetA();
	
}
}
