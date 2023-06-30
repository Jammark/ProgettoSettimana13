package model;

public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale implements Riproducibile {

	protected int volume, durata;

	protected ElementoMultimedialeRiproducibile(String titolo, int volume, int durata) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.println(getStampa());
		}

	}

	protected abstract String getStampa();

	@Override
	protected char getCarattere() {

		return '!';
	}

	public void alzaVolume() {
		this.volume++;
	}

	public void abbassaVolume() {
		this.volume--;
	}
}
