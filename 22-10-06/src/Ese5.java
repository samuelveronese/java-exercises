import java.util.Scanner;

public class Ese5 {

	/*
	 * Si scriva un programma che legge n >= 1 da tastiera e stampa una piramide di
	 * altezza n.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		do {
			n = scanner.nextInt();
		} while (n < 1);

		scanner.close();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("@");
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("@");
			System.out.println();
		}

	}

}
