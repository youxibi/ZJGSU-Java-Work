package work3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Work3TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,tmp;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		System.out.println("请输入整数数量：");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			tmp=scanner.nextInt();
			if(map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp)+1);
			}else {
				map.put(tmp, 1);
			}
		}
		Set<Integer> set=map.keySet();
		for(Integer a:set) {
			System.out.println("整数"+a+"出现次数为"+map.get(a)+"次");
		}
	}
}
