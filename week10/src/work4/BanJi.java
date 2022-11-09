package work4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BanJi {
	private String name;
	List<Student> students=new ArrayList<Student>();
	public BanJi() {
		// TODO Auto-generated constructor stub
	}
	public BanJi(String name) {
		super();
		this.name=name;
	}
	public void register(String name, int age, String sex, int chineseScore, int mathScore, int englishScore) {
		students.add(new Student(name, age, sex, chineseScore, mathScore, englishScore));
	}
	
	public void sort() {
		Collections.sort(students);
	}
	
	public void print() {
		for(Student i:students) {
			System.out.println(i);
		}
	}
}
