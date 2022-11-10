import java.util.Scanner;

public class Ese2 {

	/*
	 * Si scriva un programma Java che legge un intero non negativo n da tastiera e
	 * stampa una cornice n x n.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		do {
			n = scanner.nextInt();
		} while (n <= 0);

		scanner.close();

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++)
					System.out.print("@");
			} else {
				for (int k = 0; k < n; k++) {
					if (k == 0 || k == n - 1)
						System.out.print("@");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
