package org.howard.edu.lsp.assignment5.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Integer> s1= new ArrayList<>();
		ArrayList<Integer> s2= new ArrayList<>();	
	
	/**
	 * Instance of IntegerSet class
	 */
	IntegerSet set1= new IntegerSet(s1);
	IntegerSet set2= new IntegerSet(s2);
	
	// TODO 
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set1.add(6);
	
	set2.add(1);
	set2.add(2);
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	
	System.out.println("Value of Set1 is:"+ set1.getlist());
	System.out.println("Value of Set2 is:" + set2.getlist());
	System.out.println("Length of Set1 is:" + set1.length());
	System.out.println("Is empty :" + set1.isEmpty());
	System.out.println("Is equal :" + set1.equals(set2));
	
	try {
		System.out.println("Largest element in set1 :" + set1.largest());
	} catch (IntegerSetException e) {
		//TODO Auto-generated catch block 
		e.printStackTrace();
	}
	
	try {
		System.out.println("Smallest element in set2 :"+ set2.smallest());
	} catch (IntegerSetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//combine both sets 
	IntegerSet setun=set1.union(set2);
	System.out.println("Union of array : " +setun.getlist());
	
	//intersection between sets 
	IntegerSet setint= set1.Intersect(set2);
	System.out.println("Intersection of array :" + setint.getlist());
	
	//difference between sets 
	IntegerSet setdif=set1.difference(set2);
	System.out.println("Difference :"+ setdif.getlist());
	
	// remove integer 
	System.out.println(set1.getlist());
	System.out.println("Does set1 contain 2? : " + set1.contains(2));
	

	
	
	
	
	
	
	}
	
		
}
