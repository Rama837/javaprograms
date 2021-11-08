package com.java.practice;

public class LargestOf3 {

	public static void main(String[] args) {
		int i=30;
		int j=50;
		int k=10;
		
		String largest=(i>j)?((i>k)? i + "is the largest" : k + "is largest"):((j>k)? j + "j is largest": k + "is largest" );
		System.out.println(largest);
		
		String smallest=(i<j)? ((i<k)? i + "is smallest": k + "is smallest"):((j<k)? j + "is smallest": k + "is smallest");
		System.out.println(smallest);
	}
	
}
