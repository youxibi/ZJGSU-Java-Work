package work4;

public class Student {
	private String name;
	private int age;
	private String sex;
	public Student(String name, int age, String sex, int chineseScore, int mathScore, int englishScore) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	@Override
	public String toString() {
		return "����:"+this.name+"  ����:"+this.age+"  �Ա�:"+this.sex;
	}
}
