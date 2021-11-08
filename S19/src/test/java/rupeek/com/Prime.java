package rupeek.com;

public class Prime {
public static void main(String[] args) {
	int num=32;
	int count=0;
	
	for(int i=2;i<=num;i++) {
	if(num%i==0) {
		count++;
	 }
	}
	if(count==1) {
		System.out.println("given number " + num + "is Prime number" );
	}
	else {
		System.out.println("given number " + num + "is not Prime number" );
	}
	
}
}
