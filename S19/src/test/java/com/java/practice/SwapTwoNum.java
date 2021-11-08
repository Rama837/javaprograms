package com.java.practice;

public class SwapTwoNum {
public static void main(String[] args) {
	int n1=20;
	int n2=30;

//	using 3rd Variable
//	int swap=n1;
//	n1=n2;
//	n2=swap;
//	System.out.println(n1 + " "+ n2);
	
//	without 3rd variable
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println(n1 + " "+ n2);
	
}
}
