package work4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Work4TestMain {
	private static final String[] GENERATE_SOURCE = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};
	private static final int STR_LEN = GENERATE_SOURCE.length;
	 private static String generateByShuffle() {
	        List<String> list = Arrays.asList(GENERATE_SOURCE);
	        Collections.shuffle(list);
	        StringBuilder randomStr = new StringBuilder();
	        for (int i = 0; i < STR_LEN; i++) {
	            randomStr.append(list.get(i));
	        }
	        return randomStr.substring(0, 10);
	    }
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		for(int i=0;i<500;i++) {
			String temp=generateByShuffle();
			strList.add(temp);
			strList.add(temp);			
		}
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		while(scanner.nextInt()!=0) {
			int n=random.nextInt(strList.size());
			System.out.println(strList.get(n));
			strList.remove(n);
		}
	}
}
