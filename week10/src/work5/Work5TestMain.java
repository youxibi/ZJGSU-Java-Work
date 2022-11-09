package work5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Work5TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] array= {" ",",","!",".","?"};
		
		for(int i=0;i<array.length;i++) {
			str=str.replace(array[i], ",");
		}
		String[] textArray=str.split(",");
		
		Set<String> set=new HashSet<String>();
		for(int i=0;i<textArray.length;i++) {
			set.add(textArray[i]);
		}
		System.out.println(set.size());
	}
}
