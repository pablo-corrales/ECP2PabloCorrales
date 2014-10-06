package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    
     private DecimalCollection collection;
        
     
     
    @Before
    public void before() {
        collection =  new DecimalCollection();
                   
        collection.add(1d);
        collection.add(2d);
        collection.add(3d);
    }
        
    
      
     @Test
     public void testSize() {   
         assertEquals(3, collection.size(), 0.001);
        }
      
     @Test
        public void testSum() {
        //TODO
          double suma =collection.sum();
          assertEquals(6d, suma, 0.001);
        
        }
      @Test
        public void testHigher() {
        
          double higher=collection.higher();
          assertEquals(3d, higher, 0.001);
            
        }
      
     
     
    
}
