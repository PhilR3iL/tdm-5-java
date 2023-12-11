package ecole3il.java.tdm5.exo13;

public class DateJour {
	private int jour;
	private int mois;
	private int annee;
	
	public DateJour(int jour, int mois, int annee) throws DateException {
		super();
		// On teste les cas extrêmes (négatifs et hors du calendrier)
		if(jour <= 0 || mois <= 0 || mois > 12 || annee == 0) {
			throw new DateException();
		}
		// On teste les jours par mois
		int joursMax = JOURS_PAR_MOIS[mois];
		// Si février et bissextile, un jour de plus
		if (mois == 2 && estBissextile(annee))
			joursMax ++;
		// Le toast de notre pain
		if( jour > joursMax)
			throw new DateException();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public static boolean estBissextile(int annee) {
		return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
	}

	private static final int[] JOURS_PAR_MOIS = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
}
