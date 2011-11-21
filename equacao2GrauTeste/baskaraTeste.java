import static org.junit.Assert.*;

import org.junit.Test;


public class baskaraTeste {

	@Test
	public void deveResolverDelta0() throws BaskaraException {
		double delta = Baskara.resolverDelta(2.0,4.0,2.0);
		assertEquals(0,delta,0);
	}
	
	@Test
	public void deveResolverDelta4() throws BaskaraException {
		double delta = Baskara.resolverDelta(0,2.0,0);
		assertEquals(2.0,delta,0);
	}
	
	@Test
	public void deveResolverEquacao(){
		double delta = 4;
		double b = -2;
		double a = 1;
		double[] resultado = Baskara.ResolverEquacao(delta,a,b);
		double[] equacao= {3.0,-1};
		
		assertArrayEquals(equacao ,resultado,0);
		
	}

	
	
}