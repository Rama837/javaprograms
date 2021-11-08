package com.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
//		1. Sort and then equal
		ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		ArrayList<String> l3= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l3));	// true
		System.out.println(l1.equals(l2));	//false
		
		Collections.sort(l3);
		System.out.println(l2.equals(l3)); 	//false
		
		
//		compare two list-find out the additional elements
		ArrayList<String> l4= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l5= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		l4.removeAll(l5);
		System.out.println(l4); 	//[F]
		
//		find out missing elements
		
		l5.removeAll(l4);
		System.out.println(l5);
		
		
		
		
		
	}
}
