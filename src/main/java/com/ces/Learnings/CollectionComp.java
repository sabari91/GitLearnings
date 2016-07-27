package com.ces.Learnings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionComp {
	
	public static void main(String args[]){
		
		Map <Integer, String> collection1 = new HashMap<Integer, String>();
		
		collection1.put(1,"BMW");
		collection1.put(2, "Benz");
		
		Map <Integer, String> collection2 = new HashMap<Integer, String>();
		
		collection2.put(1, "BMw");
		collection2.put(2, "Benz");
		
		
		for (Entry<Integer, String> temp : collection1.entrySet()){
			
			String a = collection2.entrySet().contains(temp) ? "yes" : "No";
			System.out.println(a);
		}
		
	}

}
