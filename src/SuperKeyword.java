
public class SuperKeyword {
	int a=10;
	static int b=20;
	
	void display(){
		this.a=15;
		System.out.println("print a...>"+a);
		
	  this.b=25;
	System.out.println("print b...>"+b);
	}
	public static void main(String args[])
	{
		SuperKeyword sk=new SuperKeyword();
		sk.display();
		
		
		
		
		
		
	}

}
