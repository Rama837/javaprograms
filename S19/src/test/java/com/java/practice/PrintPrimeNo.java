package com.java.practice;

public class PrintPrimeNo {
public static void main(String[] args) {
	int num=100;
	int pnum=0;
	for(int i=2;i<num;i++) {
		pnum=i;
		int count=0;
		for(int j=2;j<=pnum;j++) {
			if(pnum%j==0)
				count++;
				}
		if(count==1) {
			System.out.print(pnum + " ");
		}
	}
}
	
}
