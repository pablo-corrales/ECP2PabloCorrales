package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    private static final String NAME="john";
    private static final String NAME_UPPER="JOHN";
    private static final String FAMILY_NAME_UPPER="LENON";
    private static final String FAMILY_NAME="lenon";
    @Before
     public void before() {
         user= new User(111, NAME, FAMILY_NAME);
     }
    @Test
    public void testUser() {
        assertEquals(111, user.getNumber());
        assertEquals("john", user.getName());    
        assertEquals("lenon", user.getFamilyName());     
    }

    @Test
    public void testFullName(){
        assertEquals(user.fullName(),NAME_UPPER+ " " +FAMILY_NAME_UPPER);       
    }
    @Test
    public void testInitials(){
         assertEquals(user.initials(),NAME.toUpperCase().substring(0, 1) + ".");
     }

}