package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interestcalcualtiontest {

	@Test
	public void testSimpleInterestCalculation() {
		Interestcalculation ic=new Interestcalculation();
		assertEquals(2500.00,ic.Calculate_SimpleInterest(10000.00, 5, 5.00),0);
	}

	@Test
	public void testCompoundInterestCalculation() {
		Interestcalculation ic=new Interestcalculation();
		assertEquals(1210.0000000000002,ic.Calculate_CompoundInterest(1000, 2, 10),0);
	}
}
