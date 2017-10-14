import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		System.out.println("enter side of the square");
		
		Scanner sc=new Scanner(System.in);
		double side=sc.nextDouble();
		double area=side*side;
		
		
		System.out.println("area of the square is >>"+area);
		
		double area1=length*width;
		
		System.out.println("enter length of the rectangle");
		double length=sc.nextDouble();
		
		System.out.println("enter width of the rectangle");
		double width=sc.nextDouble();
		
		
	    System.out.println("area of the rectangle...>"+area1);
		
		
		
		

	}

}
