package work3;

public class Staff extends Employee{
	private final String title;
	public Staff(String name,String address,String callNunber,String emailAddress,String offic,int salary,String date,String title){
		super(name, address, callNunber, emailAddress, offic, salary, date);
		this.title=title;
	}
	
	public String toString(){
		return "Àà±ð:Staff ÐÕÃû:"+this.name;
	}
	
}
