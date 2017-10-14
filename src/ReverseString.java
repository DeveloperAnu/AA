import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String input;
		String reverse = "  ";
		System.out.println("Enter input string");

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println("reverse string =" + reverse);

	}

}
