package work1;

import java.util.Scanner;

public class Work1TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str = scanner.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			String s=str.substring(i,i+1);
			sum+=Integer.parseInt(s);
		}
		System.out.println(sum);
	}
	
}
