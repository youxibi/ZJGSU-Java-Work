package work3;

public class Employee extends Person{
	protected final String office;
	protected final int salary;
	protected final String date;
	
	public Employee(String name,String address,String callNunber,String emailAddress,String offic,int salary,String date){
		super(name, address, callNunber, emailAddress);
		this.office=offic;
		this.salary=salary;
		this.date=date;
	}
	
	public String toString(){
		return "Àà±ð:Employee ÐÕÃû:"+this.name;
	}
}
