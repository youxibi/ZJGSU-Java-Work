package work1;

public class Dog extends Animal{
	public Dog(String name,int age,float weight){
		super(name,age,weight);
	}
	public void eat(){
		System.out.println("Dog eat.");
	}
	public void speak(){
		System.out.println("Dog speak.");
	}
	public void herdSheep(){
		System.out.println("Dog herd sheep.");
	}
}
