package work1;

public class Cat extends Animal{
	public Cat(String name,int age,float weight){
		super(name,age,weight);
	}
	public void eat(){
		System.out.println("Cat eat.");
	}
	public void speak(){
		System.out.println("Cat speak.");
	}
	public void carryFish(){
		System.out.println("Cat carry fish.");
	}
}
