package work1;

import java.util.Scanner;

public class Work1TestMain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strs=str.split("¡¢");
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < strs.length; i=i+2) {
			sb=new StringBuffer();
			if(i+1<strs.length) {
				sb.append(strs[i]);
				sb.append(strs[i+1]);
			}
			else {
				sb.append(strs[i]);
			}
			sb.reverse();
			System.out.printf("%s",sb.toString());
		}
	}
}
