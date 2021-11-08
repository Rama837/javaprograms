package programsOnNumbers;

public class PrimeNumbers {
public static void main(String[] args) {
	int num=16,count=0;
	for(int i=2; i<=num;i++) {
		if(num%i==0) {
			count++;
				}
	}
	if(count==1) {
		System.out.println("given number " + num + "is a PrimeNumber");
	}else {
		System.out.println("given number " + num + "is not a PrimeNumber");
	}
}
}
