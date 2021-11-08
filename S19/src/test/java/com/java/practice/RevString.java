package com.java.practice;

import java.util.Scanner;

public class RevString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=scan.nextLine();
	String reverse=reverse(str);
	System.out.println(reverse);
	
}

public static String reverse(String str) {
	String reverse="";
	for(int i=0; i<str.length();i++) {
		reverse=str.charAt(i)+reverse;
	}
	return reverse;
}
}

//i love app
//ppa evol i