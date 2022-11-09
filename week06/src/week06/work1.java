package week06;
import java.util.Scanner;


public class work1 {
	
	public int jiecheng(int x) {
		if(x==1)return 1;
		return x*jiecheng(x-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		work1 work = new work1();
		
		int num=0;
		for(int i=1;i<=x;i++) {
			num+=work.jiecheng(i);
		}
		System.out.println(num);
	}

}
