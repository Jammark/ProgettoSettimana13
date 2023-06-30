package model;

public class Immagine extends ElementoMultimediale implements Visibile {

	private int luminosità;

	public Immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}

	@Override
	public void show() {
		String out = getTitolo() + " " + ripetiCarattere(luminosità);
		System.out.println(out);

	}

	@Override
	protected char getCarattere() {

		return '*';
	}

	public void aumentaLuminosità() {
		this.luminosità++;
	}

	public void diminuisciLuminosità() {
		this.luminosità--;
	}
}
