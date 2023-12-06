package org.encap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.*;




public class lists {

	public static void main(String[] args) {
		     
//	Encapsulation e= new Encapsulation();
//	e.setId(99);
//	e.setName("Ajeesh");
//	e.setPhon(8754086149l);
    
//	int id = e.getId();
//	System.out.println(id);
//	String name = e.getName();
//	System.out.println(name);
//	Long phon = e.getPhon();
//	System.out.println(phon);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getPhon());
		
	Encapsulation e1= new Encapsulation();
	e1.setId(99);
	e1.setName("Ajeesh");
	e1.setPhon(8754086149l);	
		
	Encapsulation e2= new Encapsulation();
	e2.setId(88);
	e2.setName("karthick");
	e2.setPhon(7754086149l);	
		
	Encapsulation e3= new Encapsulation();
	e3.setId(77);
	e3.setName("raj");
	e3.setPhon(9754086149l);	
		
	List<Encapsulation> li = new ArrayList<>();	
	li.add(e1);
	li.add(e2);
	li.add(e3);
		
	Encapsulation Ajeesh =  li.get(0);
	int id = Ajeesh.getId();
	System.out.println(id);
	System.out.println(li.get(1).getName());
	System.out.println(li.get(2).getPhon());
	
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i).getId());
		System.out.println(li.get(i).getName());
		System.out.println(li.get(i).getPhon());
		
	}
	System.out.println();
	for (Encapsulation x : li) {
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getPhon());
		
		
	}
////map
//	Encapsulation e1= new Encapsulation();
//	e1.setId(99);
//	e1.setName("Ajeesh");
//	e1.setPhon(8754086149l);	
//		
//	Encapsulation e2= new Encapsulation();
//	e2.setId(88);
//	e2.setName("karthick");
//	e2.setPhon(7754086149l);	
//		
//	Encapsulation e3= new Encapsulation();
//	e3.setId(77);
//	e3.setName("raj");
//	e3.setPhon(9754086149l);
	//Map<String, Encapsulation> mp = new LinkedHashMap<String, Encapsulation>();


	
	
	
	
	
	
	
	
	
	
	
	
		
	}		
	
}
