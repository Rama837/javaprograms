package com.java.practice;

public class Print1_100WithOutLoop {

	public static void main(String[] args) {	
		printNum(1);	
		printNum(1,10);
	}

	public static void printNum(int FirstNum, int EndNum) {
		if(FirstNum<=EndNum) {
			System.out.println(FirstNum);
			FirstNum++;
			printNum(FirstNum, EndNum);
		}
	}
	
	
	public static void printNum(int i) {
		if(i<=25) {
			System.out.println(i);
			i++;
			printNum(i);// recursive function
		}
	}
}

