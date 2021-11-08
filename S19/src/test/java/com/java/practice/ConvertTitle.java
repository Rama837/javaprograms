package com.java.practice;

public class ConvertTitle {
 public static void main(String[] args) {
	
	 String str="my name is rama";
	 String[] str1=str.split(" ");
	 
	 for(int i=0;i<str1.length;i++)
 {
		 String word=str1[i];
		 if(Character.isLowerCase(word.charAt(0))) {
			 word=Character.toUpperCase(word.charAt(0))+word.substring(1);
		 }
		 System.out.print(word+" ");
 }
}
}
