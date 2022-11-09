package work2;

public class FilledTriangle extends Triangle{
	private String color;
	private boolean filled;
	
	public FilledTriangle(){
		super();
	}
	public FilledTriangle(double side1,double side2,double side3){
		super(side1,side2,side3);
	}
	public FilledTriangle(double side1,double side2,double side3,String color,boolean filled){
		super(side1,side2,side3);
		this.color=color;
		this.filled=filled;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public void setfilled(boolean filled){
		this.filled=filled;
	}
	public String getcolor(){
		return this.color;
	}
	public boolean getfilled(){
		return this.filled;
	}
	
	public void showInf(){
		System.out.println("面积:"+getArea()+" 周长:"+getPerimeter()+" 颜色:"+getcolor()+" 是否填充:"+getfilled());
	}
}
