//import java.util.Scanner;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		int count = 10;
		System.out.println("Enter any number");
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		 */
		int[] n = new int[count];
		n[0] = 0;
		n[1] = 1;

		for (int i = 2; i < count; i++) {
			n[i] = n[i - 1] + n[i - 2];
		}
		for (int i : n) {
			System.out.println(i);
		}

	}

}
