package work3;

import java.util.Arrays;
import java.util.Random;

public class Work3TestMain {
	
	public static void main(String[] args) {
		Lft[] lfts=new Lft[10];
		Random random=new Random();
		for (int i = 0; i < 10; i++) {
			lfts[i]=new Lft(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
		}
		Arrays.sort(lfts,new LftCamparator());
		for (Lft lft : lfts) {
			System.out.println(lft);
		}
	}
}
