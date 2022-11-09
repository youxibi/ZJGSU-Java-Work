package work3;

public class Student extends Person{
	private final String grade;
	public Student(String name,String address,String callNunber,String emailAddress,String grade){
		super(name, address, callNunber, emailAddress);
		this.grade=grade;
	}
	
	public String toString(){
		return "Àà±ğ:Student ĞÕÃû:"+this.name;
	}
}
