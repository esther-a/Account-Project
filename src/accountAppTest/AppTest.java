package accountAppTest;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import accountApp.Account;
import accountApp.App;
import accountApp.Hello;
import accountApp.Service;

public class AppTest {

	
	@Test
		public void testAccount() 
		{
			Account testAbi = new Account (123, "Abi", "Adams");
			testAbi.setAccNo(456);
			assertEquals ("this is the wrong account", testAbi.getAccNo(), 456);
		}
	
		
	
	@Test
		public void testFirstName() 
		{
			Account testBob = new Account (234, "Bob", "Barnes");
			testBob.setFirstName("Bobi");
			assertEquals ("this is the wrong name", testBob.getFirstName(), "Bobi" );
		}
	
	
	@Test
	public void testLastName() 
		{
			Account testBob = new Account (345, "Cece", "Childs");
			testBob.setLastName("Childs");
			assertEquals ("this is the wrong name", testBob.getLastName(), "Childs" );
		}


	@Test
	
	public void testHelloWorld()
		{
			Hello testHello = new Hello ();
			assertEquals ("this is the wrong greeting", testHello.hi(), "Hello world!");
		}
	
	
	
	@ Test
	public void testHashMap ()
	{
		Service testService = new Service();
		Account Dave = new Account (456, "Dave", "Daniels");
		testService.addAcc(Dave);
		assertEquals("wrong account details", testService.getAcc(456), Dave);
		
		
	}
}
