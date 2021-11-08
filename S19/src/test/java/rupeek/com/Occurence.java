package rupeek.com;

public class Occurence {
	public static void main(String[] args) {
		int[] x= {10,15,12,12,21};

		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=0;j<x.length;j++) {
				if(x[i]==x[j] && i>j) {
					break;
				}
				if(x[i]==x[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(x[i] + " occured " + count +" times");
			}
		}	
	}
}
