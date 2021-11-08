package com.java.practice;

public class RevStringPrgm2 {
	
	public static void main(String[] args)
	{
		String name="I love appium";
		String stringArray[]=name.split("\\s");
		
		
		String revName="";
		for(int i=stringArray.length-1;i>=0;i--)
		{
			revName=revName+stringArray[i]+" ";
			
			
		}
		
		String[] array1=revName.split("\\s");
		for(int i=0;i<array1.length;i++)
		{
			StringBuffer sb=new StringBuffer(array1[i]);
			sb.reverse();
			String s=new String(sb);
			System.out.print(s+" ");
		}
		
	}

}
