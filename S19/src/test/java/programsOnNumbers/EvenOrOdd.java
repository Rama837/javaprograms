package programsOnNumbers;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Given number " + n + " is Even");
		}
		else {
			System.out.println("Given number " + n + " is Odd");
		}
	}
}
