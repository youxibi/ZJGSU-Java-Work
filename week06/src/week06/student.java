package week06;

public class student {
	String name;
	int age;
	String sex;
	Float[] scores=new Float[6];
	
	public student(String name,int age,String sex,Float grade0,Float grade1,Float grade2,Float grade3,Float grade4,Float grade5 ) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.scores[0]=grade0;
		this.scores[1]=grade1;
		this.scores[2]=grade2;
		this.scores[3]=grade3;
		this.scores[4]=grade4;
		this.scores[5]=grade5;
	}
	
	public Float sumscore() {
		Float sum=0f;
		for(int i=0;i<6;i++) {
			sum+=this.scores[i];
		}
		return sum;
	}
	public Float avescore() {
		Float sum=this.sumscore();
		return sum/6;
	}
}
