package work3;

public class Person {
	protected final String name;
	protected final String address;
	protected final String callNumber;
	protected final String emailAddress;
	

	public Person(String name,String address,String callNunber,String emailAddress){
		this.name=name;
		this.address=address;
		this.callNumber=callNunber;
		this.emailAddress=emailAddress;
	}
	
	public String toString(){
		return "Àà±ð:Person ÐÕÃû:"+this.name;
	}
}
