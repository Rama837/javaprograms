package com.ArrayPrograms;

public class OccurenceOfNo {

	public static void main(String[] args) {
		
	
	int[] x= {4,6,4,6,4,3,1,3,5,6,8};
	
	for(int i=0;i<x.length;i++) {
	int count=0;
	 
	for(int j=0;j<x.length;j++) {
		if(x[i]==x[j] && i>j) {
		break;	
		}
		if(x[i]==x[j]) {
			count++;
		}
	}
	if(count>0) {
		System.out.println(x[i] + " is occured " + count + " times");
	}
	}
	}
}
