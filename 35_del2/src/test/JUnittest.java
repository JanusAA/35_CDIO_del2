/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import del2.Account;

/**
 * @author janus
 *
 */
public class JUnittest {

	/**
	 * @throws java.lang.Exception
	 */
	Account testAccount;
	
	
	
	@Before
	public void setUp() throws Exception {
		testAccount = new Account(1000);
	}

	/** 
	 * @throws java.lang.Exception
	 */

	
	@After
	public void tearDown() throws Exception {
		testAccount = null;
	}

	/**
	 * Test method for {@link del2.Account#Account(int)}.
	 */

	public void testAccount() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link del2.Account#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		int expected = 1000;
		int actual = testAccount.getBalance();
		assertEquals(expected,actual);
	}

	/**
	 * Test method for {@link del2.Account#addToCurrentBalance(int)}.
	 */
	@Test
	public void testAddToCurrentBalance() {
		
		//Kalder metoden addToCurrentBalance på instansen testAccount, og derefter definere vi vores expected værdi og tester i forhold til den actual værdi.
		testAccount.addToCurrentBalance(-999999);
		
		int expected = 0;
		int actual = testAccount.getBalance();
		
		assertEquals(expected,actual);
	}

}
