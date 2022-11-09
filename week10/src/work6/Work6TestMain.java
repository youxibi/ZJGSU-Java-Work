package work6;

import java.util.Scanner;

public class Work6TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		System.out.println(getMaxSameString(str1, str2));
	}
	
	public static String getMaxSameString(String str1,String str2) {
		String max=str1.length()>str2.length()?str1:str2;
		String min=str1.length()<str2.length()?str1:str2;
		for(int i=min.length();i>0;i--) {
			for(int x=0,y=i;y<=min.length();x++,y++) {
				String s=min.substring(x,y);
				if(max.contains(s)) {
					return s;
				}
			}
		}
		return null;
	}
}
