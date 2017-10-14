
public class Rectangle {
	

	
	void calculate( int s){
		System.out.println("area of square..>"+s*s);
	}
	
	void calculate(int l, int b){
		System.out.println("area of rectangle...>"+(l*b));
	}

	public static void main(String[] args) {
		
		Rectangle re=new Rectangle();
		re.calculate(5);
		re.calculate(2, 3);

	}

}
