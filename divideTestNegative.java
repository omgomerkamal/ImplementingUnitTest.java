package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTestNegative {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.divide(10,5);
		assertEquals(1, output);
	}

}
