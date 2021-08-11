package Tutorial4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalc {
	private Calc calc;
	
	@BeforeEach
	void setupTests(){
		calc = new Calc();
	}
	
	@Test
	void testAddition() {
		int num1 = 5;
		int num2 = 5;
		assertEquals(calc.add(num1, num2), 10);
	}

}
