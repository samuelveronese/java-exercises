
public class Ese3 {

	/*
	 * Si scriva un programma che stampa, una dopo l'altra, nove cornici, da quella
	 * 2 x 2 a quella 10 x 10.
	 */

	public static void main(String[] args) {

		for (int n = 2; n <= 10; n++) {
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
			System.out.println();
		}
	}

}
