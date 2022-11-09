package work1;

public class testmain {
	public static void main(String[] args) {
		Pig pig1=new Pig("pig1", 2, 100);
		Dog dog1=new Dog("dog1",2,20);
		Cat cat1=new Cat("cat1", 3, 10);
		
		pig1.dig();
		dog1.herdSheep();
		cat1.carryFish();
		
	}
}
