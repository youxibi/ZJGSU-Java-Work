package work5;

import java.awt.desktop.AppHiddenListener;

public class Student {
	private String name;
	private int age;
	private String sex;
	private int chinese;
	private int math;
	private int english;
	public Student() {
		
	}
	public Student(String name,int age,String sex,int chinese,int math,int english) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.chinese=chinese;
		this.math=math;
		this.english=english;
	}
	
	public int sumScore() {
		return this.chinese+this.math+this.english;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "name:"+name+"  age:"+age+"  sex:"+sex+" chinese:"+chinese+"  math:"+math+"  english:"+english;
	}
}
