package rupeek.com;

public class RevStr {
	public static void main(String[] args) {
		String str="I am Sowmya";  //Sowmya am I
		String[] arr= str.split(" ");
		
	
		for(int i=arr.length-1;i>=0;i--)
		{
	
		System.out.print(arr[i]+ " ");
	}
}
}
