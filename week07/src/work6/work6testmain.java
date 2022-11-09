package work6;

import java.util.Random;

public class work6testmain {
	
	public static void main(String[] args) {
		int first=10;
		int second=40;
		int third=50;
		int sum=200;
		Random random=new Random();
		while(sum>0){
			int a=random.nextInt(sum)+1;
			int b=201-sum;
			if(a<=first) {
				first--;
				System.out.println(b+"号了一等奖");
			}
			else if(a<=second) {
				second--;
				System.out.println(b+"号了二等奖");
			}
			else if(a<=third) {
				third--;
				System.out.println(b+"号了三等奖");
			}
			else {
				System.out.println(b+"号没中奖");
			}
			sum--;
		}
	}
	
}
