package rupeek.com;

public class Palindrome {
public static void main(String[] args) {
	int num=151;
	int rev=0;
	int temp=num;
	
	while(num>0) {
		int var=num%10;
		rev=rev*10+var;
		num=num/10;
	}
System.out.println(rev);
	
if(rev==temp) {
System.out.println("Given number " + temp +" is Palindrome" );
	}
else {
	System.out.println("Given number " + temp +" is not a Palindrome" );
	}
}

}

