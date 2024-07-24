import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShippingCalculatorTest {

	ShippingCalculator shippingCalculator;
	
	@BeforeEach
	void setUp() {
		shippingCalculator = new ShippingCalculator();
	}
	
	@Test
	public void testStandardShipping() {
		assertEquals(50,shippingCalculator.calculateShippingCosts('S', 10));
	}
	@Test
	public void testExpressShipping() {
		assertEquals(100,shippingCalculator.calculateShippingCosts('E', 10));
	}
	@Test
	public void testOvernightShipping() {
		assertEquals(200,shippingCalculator.calculateShippingCosts('O', 10));
	}
	@Test
	public void testNoShippingOption() {
		assertEquals(0,shippingCalculator.calculateShippingCosts('x', 10));
	}
	@Test
	public void testZeroWeight() {
		assertEquals(0,shippingCalculator.calculateShippingCosts('S', 0));
	}
	@Test
	public void testNegativeWeight() {
		assertEquals(0,shippingCalculator.calculateShippingCosts('S', -5));
	}

}
