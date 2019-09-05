package heritagesimple;

public class A {
	protected int a1=1;
	int a2=1;
	private int a3=1;
	public int a4=2;
    static int a5=3;
	protected int m1A() {
		return a3;

	}

    void m2A() {

	}

	protected void afficheObjetA() {
      System.out.println("A [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]");
	}
	public void m4A() {

	}
	public A(int a1,int a2,int a3) {
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
		
		
	}

	@Override
	public String toString() {
		return "A [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]";
	}
	
}
