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
		System.out.println("姓名:"+this.name+"  年龄:"+this.age+"  体重:"+this.weight+"  活跃度:"+this.activity+"  灵敏度:"+this.sensitivity+"  平均值:"+String.format("%.2f", this.getAve()));
	}
}
