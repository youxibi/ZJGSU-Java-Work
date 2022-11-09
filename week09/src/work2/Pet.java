package work2;

public class Pet {
	private String name;
	private int age;
	private int weight;
	private int activity;
	private int sensitivity;
	public Pet() {
	}
	public Pet(String name,int age,int weight,int activity,int sensitivity) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.activity=activity;
		this.sensitivity=sensitivity;
	}
	
	
	public Float getAve() {
		int sum=this.weight+this.activity+this.sensitivity;
		return (float)sum/3;
	}
	
	public void print() {
		System.out.println("����:"+this.name+"  ����:"+this.age+"  ����:"+this.weight+"  ��Ծ��:"+this.activity+"  ������:"+this.sensitivity+"  ƽ��ֵ:"+String.format("%.2f", this.getAve()));
	}
}
