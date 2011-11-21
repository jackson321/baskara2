
public class Baskara {

	public static double resolverDelta(double a, double b, double c) throws BaskaraException {
		
				
		double delta = Math.sqrt((b * b) - (4 * a * c));
		
		if (delta < 0) {
			throw new BaskaraException();
		}
		
		return delta;
	}

	public static double[] ResolverEquacao(double delta,double a,double b) {
		
		
		double[] equacao = new double[2];
		equacao[0] = (((-b) + (delta))/(2 * a));
		equacao[1] = (((-b) - (delta))/(2 * a));
		
		return equacao;
	}

}
