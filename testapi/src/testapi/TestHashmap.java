package testapi;

import java.util.*;

public class TestHashmap {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put(1,"sall");
	h.put(2,"gueye");
	h.put(3,"Ndiaye");
	h.put(4,"koulibaly");
	h.put("saliou",77789928);
	h.put(new Integer(1),77789928);
	h.put("saliou","gueye");
	
	for(int i=0;i<=h.size();i++) {
		
		
	}
	System.out.println(h.keySet()+","+h.values());
	System.out.println(h.entrySet());
	System.out.println(h.containsKey(10));
	System.out.println(h.isEmpty());
	System.out.println(h.clone());
	System.out.println(h.get(3));
	System.out.println(h.remove(1));
	System.out.println(h.entrySet());
	System.out.println(h.containsValue("Ndiaye"));
	System.out.println(h.size());
	HashMap <Integer,String> h1=new HashMap<Integer,String>(3) ;
	h1.put(1, "mangue");
	h1.put(2, "orange");
	h1.put(3, "raisin");
	h1.put(4, "pomme");
	System.out.println(h1);
	HashMap h2=(HashMap) h1.clone();
	System.out.println(h2);
	h.putAll(h2);
	System.out.println(h);
	ArrayList l1=new ArrayList();
	l1.add(h1);
	l1.add(h2);
	l1.add(2);
	System.out.println(l1);
	
	//System.out.println(h.values());
	//System.out.println(h);
	/*
	System.out.println(h.get(1));
	System.out.println(h.containsValue("Ndiaye"));
	

	System.out.println(h.entrySet());
	System.out.println(h.get(1));
	
	System.out.println(h.remove(1));
	System.out.println(h.entrySet());*/
	
}
}
