package programsOnNumbers;

public class AllPrograms {

	public static void main(String[] args) {
////Sum Of digits of a Number
//		int n=856;
//		while(n>9){
//			int sum=0;
//			while(n>0) {
//				int digit=n%10;
//				sum=sum+digit;
//				n=n/10;
//			}
//			n=sum;
//		}
//		System.out.println(n);
		
		
		/**	Factorial

		int fact=1, num=7;

		for(int i=1;i<=num;i++) {
		fact=	fact*i;
		}
		System.out.println(fact);

		 **/

////		Prime Or Not

//		int num=11,count=0;
//		for(int i=2; i<=num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==1) {
//			System.out.println("given number " + num + "is a PrimeNumber");
//		}else {
//			System.out.println("given number " + num + "is not a PrimeNumber");
//		}

////	Print PrimeNum	
//		int num=100;
//		int pnum=0;
//		for(int i=2;i<num;i++) {
//			pnum=i;
//			int count=0;
//			for(int j=2;j<=pnum;j++) {
//				if(pnum%j==0)
//					count++;
//					}
//			if(count==1) {
//				System.out.print(pnum + " ");
//			}

		/**		Swapping 2 No's

		int i=2, j=3;

		i=i+j;
		j=i-j;
		i=i-j;		

		System.out.println(i);
		System.out.println(j);

//		Swapping 2 Strings

		String str1="Ram";
		String str2="Sri";

		str1=str1+str2; //RamSri
		str2=str1.substring(0,str1.length()-str2.length());//Ram
		str1=str1.substring(str2.length());//

		System.out.println(str1);
		System.out.println(str2);

		 **/

////		Fibbonaci series

//		int i=0, j=1,num=10;
//
//		for(int i1=1;i1<=num;i1++) {
//
//			System.out.print(i);
//
//			int sum=i+j;
//			i=j;
//			j=sum;
//		}

		/**  Occurrence of Char

		String s="JavaPrograms";
		s=s.toLowerCase();

		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch1=s.charAt(i);
			for(int j=0; j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2 && i>j ){
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+ " = " + count + " times");
			}
		}
			or
		
		String str="abbcdddeee";
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j] ) {
					count++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0') {
				System.out.println(arr[i]+ "=" + count);
			}
		}
		 **/

//		Occurrence Of a Number
		
//		 	int x[]= {4,5,4,56,64,5,54,9,6,4};
//		for(int i=0;i<x.length;i++) {
//		int count=0;
//		for(int j=0;j<x.length;j++) {
//			if(x[i]==x[j] && i>j) {
//				break;
//			}
//			if(x[i]==x[j]) {
//				count++;
//			}
//		}
//		if(count>0) {
//			System.out.println(x[i] + " = " + count + " times");
//		}
//		}
		 
		/**
		 
		 **/
		
	}

}
