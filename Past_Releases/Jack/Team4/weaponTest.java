
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class weaponTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	


	public class WeaponTest extends TestCase{
		
		
		public void testUpgrade(){
			Weapon one = new Weapon();

			one.setUpgrade(1);
			one.upgrade();
			
			int testAtk = one.getWpatk();
			assertEquals(testAtk,17);
			
		}
		
		public void testWepCheck(){
			Weapon two = new Weapon();
			
			two.setUpgrade(999);
			two.wepCheck();
		}

	}


}
