package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	 private User us;
	
	 @Before
	    public void before() {
	        us = new User(1,"Prueba","Test");
	    }

	    @Test
	    public void testUser() {
	    	assertEquals(1, us.getNumber());
	        assertEquals("Prueba", us.getName());
	        assertEquals("Test", us.getFamilyName());
	    }
	    
	   
}
