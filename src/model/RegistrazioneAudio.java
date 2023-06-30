package model;

public class RegistrazioneAudio extends ElementoMultimedialeRiproducibile {

	public RegistrazioneAudio(String titolo, int volume, int durata) {
		super(titolo, volume, durata);

	}

	@Override
	protected String getStampa() {

		return getTitolo() + " " + ripetiCarattere(volume);
	}


}
