package com.java.practice;

public class ReverseString {

	public static void main(String[] args)
	{
		String name="I love appium";
		String[] stringArray = name.split("\\s");

		String revName="";
		for(int i=stringArray.length-1;i>=0;i--)
		{
			revName=revName+stringArray[i]+" ";
		}

		System.out.println(revName);

	}

}
