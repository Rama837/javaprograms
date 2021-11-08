package com.java.practice;

public class StudentEligibility {

	public static void main(String[] args) {
			
	int sub1=65;
	int sub2=80;
	int sub3=95;
	int sub4=55;
	
	int sum=sub1+sub2+sub3+sub4;
	double percent=sum%400;
//	System.out.println(res);
//	double percent=res*100;
		
	if(percent>70) {
		System.out.println("You are Elgible for 3i infotech Company");
	}
	else {
		System.out.println("Sry, You are not Elgible for 3i infothech company");
	}
	
	}
	
}
