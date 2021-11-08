package programsOnNumbers;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
				System.out.println("enter the string");
		String sc = scan.next();

		for(int i=sc.length()-1; i>=0;i--) {
//			char str = sc.charAt(i);
//			System.out.print(str);
			
			System.out.print(sc.charAt(i));
		}
	}
}
