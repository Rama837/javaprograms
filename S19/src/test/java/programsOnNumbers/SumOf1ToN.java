package programsOnNumbers;

import java.util.Scanner;

public class SumOf1ToN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
 int n=sc.nextInt();
 int sum=0;
 for(int i=1;i<=n;i++) {
	 sum=i+sum;
	 }
 System.out.println("Sum of 1 to " + n + " is " + sum);
}
}
