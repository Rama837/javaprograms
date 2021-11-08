package com.java.practice;

public class AddNoFrmStr {

public static void main(String args[]){  
String str="abc123@%";
int sum=0;
for(int i=0;i<str.length();i++) 
{
	
	if(Character.isDigit(str.charAt(i))) 
	{
		int num=Integer.parseInt(String.valueOf(str.charAt(i)));
	sum=sum+num;
	}
	
}
System.out.println(sum);
for (int j = 0; j < str.length(); j++) {
	
	char special = str.charAt(j);
	if(!(special>='0' && special<'9') && !(special>='a' && special<='z' || special>='A' && special<='Z'))
	{
		System.out.print(special);
	}
	
//	if(!Character.isLetterOrDigit(str.charAt(i))&& !Character.isWhitespace(str.charAt(i))) {
//		System.out.println(str.charAt(i));
//	}
	}

}
}


