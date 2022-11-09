package work2;
import java.util.Scanner;

public class work2testmain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		double side1,side2,side3;
		String color;
		boolean filled;
		
		side1=scanner.nextDouble();
		//System.out.println(side1);
		side2=scanner.nextDouble();
		//System.out.println(side2);
		side3=scanner.nextDouble();
		//System.out.println(side3);
		
		color=scanner.next();
		//System.out.println(color);
		filled=scanner.nextBoolean();
		
		FilledTriangle sjx=new FilledTriangle(side1,side2,side3,color,filled);
		
		sjx.showInf();
	}
}
