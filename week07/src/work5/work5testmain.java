package work5;

import java.util.Random;

public class work5testmain {
	
	
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
	       int number=18+random.nextInt(4);
	     return number;
	 }
	
	 public static String getRandomSex(){
	     Random random=new Random();
	     int number=random.nextInt(2);
	     if(number==0)return "ÄÐ";
	     else return "Å®";
	 }
	 
	 public static int getRandomScore(){
	     Random random=new Random();
	       int number=random.nextInt(101);
	     return number;
	 }
	
	
	public static void main(String[] args) {
		Student student[]=new Student[1000];
		for(int i=0;i<1000;i++) {
			String name=getRandomName(3);
			String sex=getRandomSex();
			int age=getRandomAge();
			int chinese=getRandomScore();
			int math=getRandomScore();
			int english=getRandomScore();
			student[i]=new Student(name,age,sex,chinese,math,english);
		}
		for(int i=0;i<1000;i++) {
			for(int j=999;j>i;j--) {
				if(student[j].sumScore()>student[i].sumScore()||student[j].sumScore()==student[i].sumScore()&&student[j].getName().charAt(1)<student[i].getName().charAt(1)) {
					Student temp=new Student();
					temp=student[i];student[i]=student[j];student[j]=temp;
				}
			}
		}
		for(int i=0;i<1000;i++) {
			System.out.println(student[i].toString());
		}
	}
}
