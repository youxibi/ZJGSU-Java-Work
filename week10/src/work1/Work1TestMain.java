package work1;

import java.util.Scanner;


public class Work1TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		int sum=0;
		int i=0;
		while(str1.indexOf(str2,i)!=-1) {
			sum++;
			i=str1.indexOf(str2,i)+1;
		}
		System.out.println(sum);
	}
}
