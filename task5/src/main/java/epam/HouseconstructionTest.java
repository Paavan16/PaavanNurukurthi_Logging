package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseconstructionTest {

	@Test
	public void test() {
		Houseconstruction hc=new Houseconstruction();
		assertEquals(9900.00 ,hc.cost("HIGH", "NO", 5.5),0);
	}

}
