
public class SK2 extends SK1 {
	
	void display(){
		super.a=20;
		System.out.println("print a..>"+super.a);
		System.out.println("print b..>"+super.b);
	}

	public static void main(String[] args) {
		new SK2().display();

	}

}
