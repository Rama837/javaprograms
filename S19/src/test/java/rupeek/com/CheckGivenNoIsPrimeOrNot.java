package rupeek.com;

public class CheckGivenNoIsPrimeOrNot {

	public static void main(String[] args) {
		int num=17, i=2, count=0;
		while(i<num/2) {
			if(num%i==0){
		count++;
		break;
		}
	i++;
			}
		if(count==0) {
			System.out.println( num + " is Prime no");
		}else {
			System.out.println( num + " is Not a Prime Number");
		}
	}

}
