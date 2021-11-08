package com.java.practice;

public class Amstrong {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int rem=n%10;
			sum=sum+(rem*rem*rem); //sum+Math.pow(n,3);
			n=n/10;
		}
	if(sum==temp) {
		System.out.println("Given no is Amstrong");
	}	
	else {
		System.out.println("Given no is not an Amstrong");
	}
	}
}
