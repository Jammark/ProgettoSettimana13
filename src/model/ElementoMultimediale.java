package model;

public abstract class ElementoMultimediale {

	private String titolo;

	protected ElementoMultimediale(String titolo) {

		this.titolo = titolo;
	}

	protected String ripetiCarattere(int n, char c) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += c;
		}
		return s;
	}

	protected String ripetiCarattere(int n) {
		return this.ripetiCarattere(n, getCarattere());
	}

	public String getTitolo() {
		return titolo;
	}

	protected abstract char getCarattere();

}
