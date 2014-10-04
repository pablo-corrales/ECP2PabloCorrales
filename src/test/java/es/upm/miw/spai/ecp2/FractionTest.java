package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction ft;
	
	@Before
    public void before() {
        ft = new Fraction(5, 10);
    }
	
	 @Test
    public void testFractionIntInt() {
	        assertEquals(5, ft.getNumerator());
	        assertEquals(10, ft.getDenominator());
	    }
	 
	 @Test
	public void testFraction() {
		 		ft = new Fraction();
		        assertEquals(1, ft.getNumerator());
		        assertEquals(1,ft.getDenominator());
	 }

	
	
}


