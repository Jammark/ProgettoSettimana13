package program;

import java.util.Scanner;

import model.ElementoMultimediale;
import model.Immagine;
import model.RegistrazioneAudio;
import model.Riproducibile;
import model.Video;
import model.Visibile;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ElementoMultimediale[] lista = new ElementoMultimediale[5];
		for (int i = 0; i < 5; i++) {
			lista[i] = leggiInput(sc);
		}

		int input = 0;
		do {
			System.out.println("Inserire un valore da 1 a 5 o 0 per uscire.");
			input = leggiNumero(sc);
			if (input > 0 && input < 6) {
				stampaElemento(lista[input - 1]);
			} else if (input != 0) {
				System.out.println("Valore non valido.");

			}

		} while (input != 0);
		sc.close();

	}

	public static ElementoMultimediale leggiInput(Scanner sc) {
		System.out.println("Inserire:");
		System.out.println("1 per Immagine");
		System.out.println("2 per Audio");
		System.out.println("3 per Video");
		int scelta;
		if (sc.hasNextInt()) {
			scelta = sc.nextInt();
		} else {
			System.out.println("Inserire un numero intero.");
			sc.next();
			return leggiInput(sc);
		}

		sc.nextLine();
		switch (scelta) {
		case 1:
			return createImmagine(sc);
		case 2:
			return createAudio(sc);
		case 3:
			return createVideo(sc);
		default:
			return leggiInput(sc);
		}


	}

	public static int leggiNumero(Scanner sc) {
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int valore = sc.nextInt();
				if (valore > 0)
					return valore;
				else {
					System.out.println("Inserire un numero intero positivo.");

					continue;
				}
			} else {
				System.out.println("Inserire un numero intero positivo.");
				sc.next();
				continue;
			}

		}
		return 0;
	}

	public static ElementoMultimediale createAudio(Scanner sc) {
		System.out.println("Inserire il titolo...");
		String titolo = sc.nextLine();
		System.out.println("Inserire durata...");
		int durata = leggiNumero(sc);
		System.out.println("Inserire volume...");
		int volume = leggiNumero(sc);

		sc.nextLine();

		return new RegistrazioneAudio(titolo, volume, durata);
	}

	public static ElementoMultimediale createVideo(Scanner sc) {
		System.out.println("Inserire il titolo...");
		String titolo = sc.nextLine();
		System.out.println("Inserire durata...");
		int durata = leggiNumero(sc);
		System.out.println("Inserire volume...");
		int volume = leggiNumero(sc);
		System.out.println("Inserire luminosità...");
		int luminosità = leggiNumero(sc);

		sc.nextLine();

		return new Video(titolo, volume, durata, luminosità);
	}

	public static ElementoMultimediale createImmagine(Scanner sc) {
		System.out.println("Inserire il titolo...");
		String titolo = sc.nextLine();

		System.out.println("Inserire luminosità...");
		int luminosità = leggiNumero(sc);

		sc.nextLine();

		return new Immagine(titolo, luminosità);
	}

	public static void stampaElemento(ElementoMultimediale em) {
		if (em instanceof Visibile) {
			((Visibile) em).show();
		} else if (em instanceof Riproducibile) {
			((Riproducibile) em).play();
		} else {
			System.out.println("Elemento sconosciuto.");
		}
	}

}
