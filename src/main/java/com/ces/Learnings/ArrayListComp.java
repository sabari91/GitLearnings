package com.ces.Learnings;

import java.util.ArrayList;

public class ArrayListComp {
	
	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("BMW");
		al.add("Audi");
		
		ArrayList<String> bl = new ArrayList<String>();
		
		bl.add("BMW");
		bl.add("Lambo");
		
		for(String temp : al){
			String a = bl.contains(temp) ? "Yes" : "No";
			System.out.println(a);
		}
		
	}

}
