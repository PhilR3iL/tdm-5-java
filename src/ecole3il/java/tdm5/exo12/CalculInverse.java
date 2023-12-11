package ecole3il.java.tdm5.exo12;

public class CalculInverse {
	public static double calculInverse(double x) {
		try {
			if(1.0/x == Double.NEGATIVE_INFINITY || 1.0/x == Double.POSITIVE_INFINITY)
				throw new ArithmeticException();
			return 1.0 / x;
		} catch (ArithmeticException e) {
			return 0.0;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(calculInverse(5));
		System.out.println(calculInverse(2));
		System.out.println(calculInverse(0));
	}
}
