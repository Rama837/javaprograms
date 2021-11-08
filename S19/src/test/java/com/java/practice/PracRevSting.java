package com.java.practice;

import java.util.Scanner;

public class PracRevSting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		
		String[] str=s.split(" ");
		String reverse=" ";
		
		for(int i=0;i<=str.length-1;i++) {
			reverse=reverse+" "+reverse(str[i]);
		}
		System.out.println(reverse.trim());
	}

	public static String reverse(String str) {
		String reverse=" ";
		for(int i=0;i<=str.length()-1;i++) {
			reverse=str.charAt(i)+reverse;
		}
		return reverse;
	}
}
