package work5;

import java.util.Scanner;

public class Work5TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		int max=a>b?a:b;
		int min=a>b?b:a;
		int sum=0;
		int m=max,n=0;
		while(m>0) {
			m/=2;
			n++;
		}
		int[] arr=new int[n];
		System.out.println(n);
		for(int i=n-1;i>=0;i--) {
			if(max%2==1&&min%2==1) {
				arr[i]=1;
			}
			else {
				arr[i]=0;
			}
			max/=2;min/=2;
		}
		for(int i=0;i<n;i++) {
			sum=sum*2+arr[i];
		}
	}
}
