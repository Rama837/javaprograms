package com.java.practice;

public class LengthOfArrayWithoutLenMetd {
	public static void main(String args[]){
		 
		  String helloWorld="This is hello world";
		  System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));
		 
		  }
		 
		  public static int getLengthOfString(String str)
		  {
		    int i=0;
		  try{
		   for(i=0;;i++)
		   {
		    str.charAt(i);
		   }
		 
		  }
		  catch(Exception e)
		  {
		 
		  }
		  return i;
		 }
}
