
import java.util.Scanner;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		boolean prime = true;
		System.out.println("Enter number to check prime or not");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;

			}
		}
		if (prime == true) {
			System.out.println("it is prime number");

		} else {
			System.out.println("it is not prime number");
		}

	}

}
