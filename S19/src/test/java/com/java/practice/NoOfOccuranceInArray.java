package com.java.practice;

public class NoOfOccuranceInArray {
public static void main(String[] args) {
	int[] a= {10,20,1,2,2,10,10};
	int[] b= {10,2,1,20,2,10,1};
	
	for(int i=0;i<a.length;i++) {
	int count=0;
	int count1=0;
	
	for(int j=0;j<b.length;j++) {
		if(a[i]==b[j]) {
			count++;
		}
		}	
	
	for(int j=i-1;j>=0;j--){
		if(a[i]==b[j]) {
			count1++;
		}
	}
	if(count1==0) {
		System.out.println("no of occurences are"+ a[i]+ "is:" + count);
	}
	}
}
}
