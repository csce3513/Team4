
package Team4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    
      Monster instance = new Monster();
      
    public MonsterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         Monster instance = new Monster();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
   @Test
    public void testInitialization(){
        System.out.println("Constructor");
        int expResult = 30;
        int res = 5;
        assertEquals(expResult, instance.getHealth()); 
        assertEquals(res, instance.doDamage()); 
        
    }
    @Test
    public void testDoDamge(){
        System.out.println("Constructor");
       int expResult = 5;
       assertEquals(expResult, instance.doDamage()); 
        
    }
    @Test
    public void testGetHealth() {
        System.out.println("getHealth");
        int expResult = 30;
        int result = instance.getHealth();
        assertEquals(expResult, result);
       
        
    }
@Test
    public void testTakeDamage() {
        System.out.println("getDamage");
        instance.takeDamage(instance.doDamage());
        assertEquals(25,instance.getHealth()); 
        
        
    }
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");
        int expResult = 500;
        instance.setHealth(500);
        assertEquals(expResult, instance.getHealth()); 
    }
  
    @Test
    public void testDeadCheck() {
        System.out.println("Die");
        boolean expResult = false;
        boolean result = instance.deadCheck();
        assertEquals(expResult, result);
        
        
    }

    
    
}
