package rupeek.com;

public class AscendingOrder {
public static void main(String[] args) {
	int[] x= {12,21,58,5,12,21,45,66,8};
	
	for(int i=0;i<x.length;i++) {
		int count=0;
		for(int j=i+1;j<x.length;j++) {
		if(x[i]==x[j] && i>j) {
			break;
		}
		if(x[i]==x[j]) {
			count++;
		}
			if(x[i]>x[j]) {
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		
		}	System.out.println(x[i]);
	}
	}
	
}


