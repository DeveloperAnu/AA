
public class SwapWithoutVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("before swapping a=" + a);
		System.out.println("before swapping b=" + b);
		swap(a, b);
	}

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a=" + a);
		System.out.println("After swapping b=" + b);

	}

}
