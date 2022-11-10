import java.util.Random;
import java.util.Scanner;

public class Ese1 {
	/*
	 * Si scriva un programma che legge da tastiera un long non negativo n e lo
	 * richiede a oltranza se l'utente lo inserisse negativo. Quindi genera n coppie
	 * (x,y) fatte da due numeri casuali di tipo double, fra -1 e 1. Per ogni coppia
	 * controlla se la coordinata (x,y) sta dentro il cerchio di raggio 1 centrato
	 * sull'origine degli assi e in tal caso incrementa una variabile dentro di tipo
	 * long. Alla fine stampa il valore della formula dentro * 4 / n senza perdere
	 * le cifre che seguono la virgola
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long n;
		do {
			n = scanner.nextLong();
		} while (n <= 0);

		scanner.close();

		Random random = new Random();
		long dentro = 0;

		for (int i = 0; i < n; i++) {
			double x = random.nextDouble(-1, 1);
			double y = random.nextDouble(-1, 1);
			System.out.println("x: " + x + " y: " + y);
			double diag = Math.sqrt((x * x) + (y * y));
			if (diag > 1)
				dentro++;

		}
		double result = (dentro * 4) / (double) n;
		System.out.println("dentro : " + dentro);
		System.out.println("Risultato finale : " + result);

	}

}
