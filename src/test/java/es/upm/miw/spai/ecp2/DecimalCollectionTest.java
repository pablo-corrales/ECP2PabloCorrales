package es.upm.miw.spai.ecp2;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class DecimalCollectionTest {
	private DecimalCollection dc;
	
	@Before
    public void before() {
        dc = new DecimalCollection();
    }
	
	 @Test
    public void testSum() {
		 assertEquals("1.5,2.5,3.5", dc.sum());
	       
	        
	    }
	 
	

}
