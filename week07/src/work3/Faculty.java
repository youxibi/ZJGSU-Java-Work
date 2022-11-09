package work3;

public class Faculty extends Employee{
	private final String workTime;
	private final String level;
	public Faculty(String name,String address,String callNunber,String emailAddress,String offic,int salary,String date,String workTIme,String level){
		super(name, address, callNunber, emailAddress, offic, salary, date);
		this.workTime=workTIme;
		this.level=level;
	}
	
	public String toString(){
		return "Àà±ð: Faculty ÐÕÃû:"+this.name;
	}
}
