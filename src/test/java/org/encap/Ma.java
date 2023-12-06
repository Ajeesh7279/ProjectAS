package org.encap;

import java.util.*;
import java.util.Map.Entry;

public class Ma {
	
public static void main(String[] args) {
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
	
	Map <String, Encapsulation> mp = new LinkedHashMap<String, Encapsulation>();
	mp.put("Ajeesh", e1);
	mp.put("Karthick", e2);
	mp.put("raj", e3);
	
	Set<Entry<String, Encapsulation>> entrySet = mp.entrySet();
	for (Entry<String, Encapsulation> entry : entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue().getId());
		System.out.println(entry.getValue().getName());
		System.out.println(entry.getValue().getPhon());
	} 
	
	
	
	
	
}

}
