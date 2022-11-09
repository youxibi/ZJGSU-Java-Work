package work1;

public class Pig extends Animal{
	public Pig(String name,int age,float weight){
		super(name,age,weight);
	}
	public void eat(){
		System.out.println("Pig eat.");
	}
	public void speak(){
		System.out.println("Pig speak.");
	}
	public void dig(){
		System.out.println("Pig dig hole.");
	}
}
