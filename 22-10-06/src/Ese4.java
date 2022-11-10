
public class Ese4 {

	/*
	 * Si scriva un programma che stampa 26 volte la cornice 10 x 10, usando ogni
	 * volta un carattere alfabetico diverso al posto di '@', dalla 'a' alla 'z'.
	 */

	public static void main(String[] args) {

		int n = 10;

		for (char c = 'a'; c <= 'z'; c++) {
			for (int i = 0; i < n; i++) {
				if (i == 0 || i == n - 1) {
					for (int j = 0; j < n; j++)
						System.out.print(c);
				} else {
					for (int k = 0; k < n; k++) {
						if (k == 0 || k == n - 1)
							System.out.print(c);
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
