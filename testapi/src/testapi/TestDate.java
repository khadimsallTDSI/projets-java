package testapi;
import java.text.*;
import java.util.*;
public class TestDate {
	public static void main(String[] args) {
	Date d=new Date();	
	Date d1=new Date();	
    System.out.println(d);
	Locale loc=new Locale("fr","ca");
	//GregorianCalendar g=new GregorianCalendar();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println(sdf.format(d));
    GregorianCalendar c1=new GregorianCalendar();
   // c1.getTime();
    System.out.println(c1.getTime());
    System.out.println(c1);
    Calendar c=Calendar.getInstance();
	int year=c.get(Calendar.YEAR);
	int res=year-1995;
	System.out.println(res); 
	}

}
 