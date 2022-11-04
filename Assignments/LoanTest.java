import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class LoanTest {
	private double delta = .005;
	public static Loan L1, L2;
   @BeforeClass
	public static void setup() {
		L1 = new Loan(2.5 , 30, 100000.00);
		L2 = new Loan(2.5 , 15, 100000.00);

	}
   @Test
	public void testMonthlyPayments() {
		assertEquals(395.12, L1.getMonthlyPayment(), delta);
		assertEquals(666.79, L2.getMonthlyPayment(), delta);

	}
   @Test
	public void testTotalPayment() {
		assertEquals(142243.52, L1.getTotalPayment(), delta);
		assertEquals(120022.06, L2.getTotalPayment(), delta);
		
	}
	@AfterClass
	public static void tearDown() {
		L1 = null;
		L2 = null;
		
	}

}
