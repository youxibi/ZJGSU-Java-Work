package work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Work3TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		Map<String, Integer> map=new HashMap<String, Integer>();
		String tmp;
		List<String> list=new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				tmp=str.substring(i,j);
				if(!map.containsKey(tmp)) {
					map.put(tmp,1);
					list.add(tmp);
				}
				else {
					map.put(tmp,map.get(tmp)+1);
				}
			}
		}
		Collections.sort(list);
		for(String s : list) {
			System.out.println(s+"="+map.get(s));
		}
		
	}
}
