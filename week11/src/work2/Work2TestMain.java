package work2;

import java.util.Iterator;
import java.util.Scanner;

public class Work2TestMain {
	public static void main(String[] args) {
		String str=new String();
		Scanner scanner=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		str=scanner.nextLine();
		sb.append(str);
		while(!str.equals("")) {
			str=scanner.nextLine();
			sb.append(str);
		}
		StringBuffer sb2=new StringBuffer();
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)>='0'&&sb.charAt(i)<='9')
				sb2.append(sb.charAt(i));
		}
		System.out.println(sb2.toString());
	}
}
