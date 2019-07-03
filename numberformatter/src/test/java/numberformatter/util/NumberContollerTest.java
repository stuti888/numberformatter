package numberformatter.util;

import static org.junit.Assert.*;
import numberformatter.exception.InvalidInputException;

import org.junit.Test;

public class NumberContollerTest {
	NumberContoller num = new NumberContoller();

	@Test
	public void test1() throws InvalidInputException, Exception {
		assertTrue("ten million ten thousand eight hundred and nine".equalsIgnoreCase(num.format("10010809")));
	}

	@Test
	public void test2() throws InvalidInputException, Exception {
		assertTrue("one hundred million one".equalsIgnoreCase(num.format("100000001")));
	}

	@Test
	public void test3() throws InvalidInputException, Exception {
		assertTrue("eight hundred and nine thousand eight hundred and nine".equalsIgnoreCase(num.format("809809")));
	}

	@Test
	public void test4() throws InvalidInputException, Exception {
		assertTrue("eight hundred and nine".equalsIgnoreCase(num.format("809")));
	}

	@Test
	public void test5() throws InvalidInputException, Exception {
		assertTrue("nine".equalsIgnoreCase(num.format("9")));
	}

	@Test
	public void test6() throws InvalidInputException, Exception {
		assertTrue("one hundred and nineteen".equalsIgnoreCase(num.format("119")));
	}

	@Test
	public void test7() throws InvalidInputException, Exception {
		assertTrue("two hundred and nineteen".equalsIgnoreCase(num.format("219")));
	}

	@Test
	public void test8() throws InvalidInputException, Exception {
		assertTrue("four thousand one hundred and twenty three".equalsIgnoreCase(num.format("4123")));
	}
	
	@Test
	public void test9() throws InvalidInputException, Exception {
		assertTrue("four thousand one hundred and twenty three".equalsIgnoreCase(num.format("4,123")));
	}
	
	@Test
	public void test11() throws InvalidInputException, Exception {
		assertTrue("ten million one hundred and one thousand eleven".equalsIgnoreCase(num.format("10101011")));
	}
	
	@Test(expected = InvalidInputException.class)
	public void test12() throws InvalidInputException, Exception {
		num.format("-1010101010");
	}
	
	@Test(expected = InvalidInputException.class)
	public void test13() throws InvalidInputException, Exception {
		num.format("1010101010010");
	}
	
	@Test(expected = InvalidInputException.class)
	public void test14() throws InvalidInputException, Exception {
		num.format("-1010101010");
	}
	
	@Test(expected = InvalidInputException.class)
	public void test15() throws InvalidInputException, Exception {
		num.format(null);
	}
	
	@Test(expected = InvalidInputException.class)
	public void test16() throws InvalidInputException, Exception {
		num.format("abc");
	}
}
