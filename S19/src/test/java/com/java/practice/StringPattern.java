package com.java.practice;


public class StringPattern {
public static void main(String[] args) {
	String str="my name is rama";
	String[] str1=str.split(" ");
	String newstr="";
	for(int i=0;i<str1.length;i++) {
		String word=str1[i];
		if(Character.isLowerCase(word.charAt(0))) {
			for(int j=0;j<str1[i].length();j++){
				if(j==0) {
					char ch=(char)(word.charAt(0)-32);
					newstr=newstr+ch;					
				}
				else {
					newstr=newstr+str1[i].charAt(j);
					}
			}
		}
		else {
			newstr=newstr+word;
		}
			System.out.println(newstr);
}
}
}