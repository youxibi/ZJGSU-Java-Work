package work1;

public abstract class  Animal {
	protected String name;
	protected int age;
	protected float weight;
	
	public Animal(){}
	
	public Animal(String name,int age,float weight){
		this();
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public abstract void eat();
	public abstract void speak();
		
	
	
}
