package work2;

import java.util.Random;

public class PetShop {
	private int N=1000;
	private String name;
	private Pet[] pets=new Pet[N];
	
	public void init() {
		for(int i=0;i<N;i++) {
			this.pets[i]=new Pet(getRandomName(3),getRandomAge(),getRandomNum(),getRandomNum(),getRandomNum());
		}
	}
	
	public void sort() {
		for(int i=0;i<N-1;i++) {
			for(int j=N-1;j>i;j--) {
				if(this.pets[j].getAve()-this.pets[j-1].getAve()>0.000001) {
					Pet temp=this.pets[j];
					this.pets[j]=this.pets[j-1];
					this.pets[j-1]=temp;
				}
			}
		}
	}
	
	public void print() {
		for (Pet pet : pets) {
			pet.print();
		}
	}
	
	public static String getRandomName(int length){
	     String str="abcdefghijklmnopqrstuvwxyz";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	       int number=random.nextInt(26);
	       sb.append(str.charAt(number));
	     }
	     return sb.toString();
	 }
	 
	 public static int getRandomAge(){
	     Random random=new Random();
	       int number=1+random.nextInt(9);
	     return number;
	 }
	 
	 public static int getRandomNum(){
	     Random random=new Random();
	       int number=random.nextInt(101);
	     return number;
	 }
}
