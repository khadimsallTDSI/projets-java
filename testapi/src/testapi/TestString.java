package testapi;

public class TestString {
public static void main(String[] args) {
	String s1=new String("salut");
	String s2=new String("bonjour");
	System.out.println(s1);
	System.out.println(s1.length());
	System.out.println(s1.substring(0, 3));
	System.out.println(s1.charAt(2));
	System.out.println(s1.concat( " "+s2+ " ".concat(s1)));
	char[] t=s1.toCharArray();
	for(int i=0;i<t.length;i++) {
		System.out.print(t[i]);
	}
	String s3=" "+s1+" ";
	
	System.out.println(s3);
	System.out.println(s3.length());
	System.out.println(s3.trim());
	System.out.println(s3.trim().length());
	System.out.println(s3.length());
	System.out.println(s3);
	System.out.println(s3.length());
	System.out.println(s3.indexOf('u'));
	System.out.println(s2.lastIndexOf('o'));
	System.out.println(s2.endsWith("our"));
	System.out.println(s3.compareTo(s3));
	System.out.println(s3.compareTo(s2));
	System.out.println(s2.toUpperCase().compareTo(s2.toLowerCase()));
	System.out.println(s2.toUpperCase().compareToIgnoreCase(s2.toLowerCase()));
	String s=String.valueOf(3);
	System.out.println(s.getClass());
	System.out.println(s);
	String s4=s1+"bon";
	System.out.println(s4);
	System.out.println(s1);
	System.out.println(s4.substring(1));
	System.out.println(s4);
	
}
}
