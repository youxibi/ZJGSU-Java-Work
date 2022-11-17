package work4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BanJi {
	private String name;
	Student[] students=new Student[10];
	int studentMaxNum=10;
	int studentNum=0;
	public BanJi() {
		// TODO Auto-generated constructor stub
	}
	public BanJi(String name) {
		super();
		this.name=name;
	}
	public void append(Student stu) {
		if(studentNum>=studentMaxNum) {
			students=Arrays.copyOf(students, studentMaxNum*2);
			studentMaxNum*=2;
		}
		students[studentNum]=stu;
		studentNum++;
	}
	
	public void sort() {
		Arrays.sort(students,0,studentNum,new StudentComparator());
	}
	
	public void print() {
		for(int i=0;i<studentNum;i++) {
			System.out.println(students[i].toString());
		}
	}
}
