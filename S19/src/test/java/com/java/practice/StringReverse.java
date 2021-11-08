package com.java.practice;

public class StringReverse {
		
		public static void main(String[] args)
		{
			String name="I love appium";
			String stringArray[]=name.split("\\s");
			
			
			String revName="";
			for(int i=stringArray.length-1;i>=0;i--)
			{
				revName=revName+stringArray[i]+" ";
				
				//System.out.println(stringArray[i]);
			}
			
			String[] array1=revName.split("\\s");
			for(int i=0;i<array1.length;i++)
			{
				if(i==1)
				{
					StringBuffer sb=new StringBuffer(array1[i]);
					sb.reverse();
					String s=new String(sb);
					System.out.print(s+" ");
				}
				else
				{
					System.out.print(array1[i]+" ");
				}
			}
			
		}


}
