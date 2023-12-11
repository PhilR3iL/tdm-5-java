package ecole3il.java.tdm5.exo11;

public class PetitProgrammeDeDecembre {
	public static void main(String[] args) {
		EntierNaturel entier;
		try {
			entier = new EntierNaturel(-4);
		} catch (MauvaiseConstanteException e) {
			System.err.println("Mauvais entier : " + e.getMauvaiseValeur());
		}
	}
}
