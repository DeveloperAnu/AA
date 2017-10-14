import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n, c, d, num = 1;
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Floyds Triangle");

		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.println(num + "  ");
				num++;
			}
		}
		System.out.println("   ");

	}
}
