package model;

public class Video extends ElementoMultimedialeRiproducibile {

	private int luminosità;

	public Video(String titolo, int volume, int durata, int luminosità) {
		super(titolo, volume, durata);
		this.luminosità = luminosità;
	}

	@Override
	protected String getStampa() {

		return getTitolo() + " " + ripetiCarattere(volume) + " " + ripetiCarattere(luminosità, '*');
	}

	public void aumentaLuminosità() {
		this.luminosità++;
	}

	public void diminuisciLuminosità() {
		this.luminosità--;
	}

}
