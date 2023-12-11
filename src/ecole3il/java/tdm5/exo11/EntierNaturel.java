package ecole3il.java.tdm5.exo11;

public class EntierNaturel {
	private int entier;

	public EntierNaturel(int entier) throws MauvaiseConstanteException {
		super();
		if (entier < 0)
			throw new MauvaiseConstanteException(entier);
		this.entier = entier;
	}

	public int getEntier() {
		return entier;
	}

}
