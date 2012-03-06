package Team4; 

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FrameTest {
    
    public FrameTest() {
    }
    Frame ne = new Frame();
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testgetIndex(){
        System.out.println("DO DAMAGE");
      
       if(ne.getIndex() < 15 && ne.getIndex() >= 0)
       {
           System.out.println("SUCCESS");
       }
       
}
       @Test
    public void testActualWord(){
        System.out.println("ACTUAL WORD");
      
      int n = ne.getIndex();
      boolean expResult = true;
     boolean m = ne.wordList[n].equals(ne.actualWord());
     
     assertEquals(expResult,m); 
       }
}
