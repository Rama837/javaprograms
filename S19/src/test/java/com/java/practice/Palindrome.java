package com.java.practice;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String");
	int num=scan.nextInt();
	int rev=0;
	int actnum=num;
	
while(num!=0) {
	int n=num%10;
	rev=rev*10+n;
	num=num/10;
}

	if(actnum==rev) {
		System.out.println("given string " + rev + " is Palindrome");
	}
	else {
		System.out.println("given string " + rev + " is not Palindrome");
		
	}
		System.out.println(rev);
	}
}
	

