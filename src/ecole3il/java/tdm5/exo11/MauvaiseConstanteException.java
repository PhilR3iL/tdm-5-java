package ecole3il.java.tdm5.exo11;

public class MauvaiseConstanteException extends Exception {
	private int mauvaiseValeur;

	public MauvaiseConstanteException(int mauvaiseValeur) {
		super();
		this.mauvaiseValeur = mauvaiseValeur;
	}

	public int getMauvaiseValeur() {
		return mauvaiseValeur;
	}
	
	
}
