package rupeek.com;

public class PrintWithNoSpaces {
	public static void main(String[] args) {
		String str="welcome to Rupeek fintech";
		String[] res=str.split(" ");

		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);	
					}
		System.out.println();
		System.out.println(str);
			}
}

