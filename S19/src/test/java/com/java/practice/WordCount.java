package com.java.practice;

public class WordCount {

	public static void main(String[] args) {
		String s="Hello Count the number of words";
		String[] str=s.split("\\s");
		
		for(String word:str) {
			System.out.println( word);
		}
	}
}
