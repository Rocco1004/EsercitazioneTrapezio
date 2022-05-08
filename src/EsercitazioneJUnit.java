import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EsercitazioneJUnit {

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

	@Test
	public void test1() {
		
		Trapezio t = new Trapezio(3,2,1);
		float risAtteso = 2.5f;
		float risOttenuto = t.area();
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	
	@Test
	public void test2() {
		
		Trapezio t = new Trapezio(6,5,5);
		float risAtteso = 27.5f;
		float risOttenuto = t.area();
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	
	@Test
	public void test3() {
		
		Trapezio t = new Trapezio(32,5,1);
		float risAtteso = 18.5f;
		float risOttenuto = t.area();
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}


}