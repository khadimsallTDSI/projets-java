package testapi;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Date;

import pack3.*;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1=new ArrayList();
		System.out.println(l1);
		System.out.println(l1.size());
		
		System.out.println(l1.isEmpty());
		l1.add(2);
		l1.add(new Integer(2));
		System.out.println(l1.size());
		Point p1=new Point(2,4);
		l1.add(p1);
		System.out.println(l1.isEmpty());
		System.out.println(l1);
		System.out.println();
		System.out.println("affichage avec for de la liste");
		for(int i=0;i<l1.size();i++) {
			System.out.println("l1["+i+"]="+l1.get(i));	
		}
		l1.add(3,p1);
		l1.add(1,new ArrayList());
		System.out.println(l1);
		System.out.println(l1);    
		((ArrayList) l1.get(1)).add(5);
		((ArrayList) l1.get(1)).add(-4);
		((ArrayList) l1.get(1)).add("bon");
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		Date d=new Date();
		Client cl1 = new Client("niang", "modou", "fac", 7777555, d, "177777");
		//cl1.ajouterClient();
		Compte c1 = new Compte("001", cl1);
		Compte c2 = new Compte("0A4R", 40000, 15000, cl1);
		Compte c3 = new Compte("0A4R", 40000, 15000, cl1);
		Compte c4 = new Compte("0003", 30000, 50000, cl1);
	    l2.add(c1);
	    l2.add(c2);
	    l2.add(c3);
	    l2.add(c4);
	    System.out.println(l2);
	    l1.addAll(2,l2);
	    System.out.println(l1);
	    for(int i=0;i<l1.size();i++) {
			System.out.println("l1["+i+"]="+l1.get(i));	
		}
	    System.out.println(l2.size());
	    l2.set(1, "modifier");
	    //l2.add("bon");
	    System.out.println("l2");
	    for(int i=0;i<l2.size();i++) {
			System.out.println("l2["+i+"]="+l2.get(i));	
		}
	    System.out.println(l2);
	    
	    System.out.println("l1");
	    System.out.println(l1);
	    for(int i=0;i<l1.size();i++) {
			System.out.println("l1["+i+"]="+l1.get(i));	
		}
	    System.out.println("l1[2]");
	    System.out.println("l1["+2+"]="+l1.get(2));
	   /* try {
	    	System.out.println("l1["+2+"]="+((ArrayList)(l1.get(2))).get(1));
	    }
	    catch(Exception e) {
	    	//System.err(e);
	    	e.getMessage();
	    }*/
	    ArrayList l3=new ArrayList(3);
	    System.out.println(l3.size());
	    l3.add(20);
	    l3.add(10);
	    l3.add(16);
	    System.out.println(l3);
	    ArrayList l4=new ArrayList(5);
	    l4.add("modou");
	    l4.add("cherie ndoumbe");
	    l4.add("madicke");
	    l4.set(1, "ahmadou");
	    System.out.println(l4);
	    l3.addAll(l4);
	    System.out.println(l3);
	    l4.set(2, "moussa");
	    System.out.println(l3);
	    ArrayList l5=l4;
	    System.out.println(l4);
	    System.out.println(l5);
	    l4.set(1, "hamet");
	    System.out.println(l4);
	    System.out.println(l5);	
	    l5.set(1, "tidiane");
	    System.out.println(l4);
	    System.out.println(l5);	
	    ArrayList l6=(ArrayList)l4.clone();
	    System.out.println(l4);
	    System.out.println(l6);
	    l4.set(1, "fama");
	    System.out.println(l4);
	    System.out.println(l6);
	    l6.set(1, "fagaye");
	    System.out.println(l4);
	    System.out.println(l6);
	    ArrayList<String> l7=new ArrayList<String>();
	    l7.add("modou");
	    l7.add("cherie ndoumbe");
	    l7.add("madicke");
	    l7.set(1, "ahmadou");
	   // List l=l7;
	}

}
