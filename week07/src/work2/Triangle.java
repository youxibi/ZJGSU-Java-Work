package work2;

public class Triangle {
	protected double side1;
	protected double side2;
	protected double side3;
	
	public Triangle(){}
	
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public void setside1(double side1){
		this.side1=side1;
	}
	public void setside2(double side2){
		this.side2=side2;
	}
	public void setside3(double side3){
		this.side3=side3;
	}
	
	public double getside1(){
		return this.side1;
	}
	public double getside2(){
		return this.side2;
	}
	public double getside3(){
		return this.side3;
	}
	
	public double getArea(){
		double p=(side1+side2+side3)/2;
		double area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public String toString(){
		return "Triangle:side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
	}
}
