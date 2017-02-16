package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArabicToRomanNumeralConverterTests {
	private ArabicToRomanNumeralConverter arabicToRomanNumeralConverter;

	@Before
	public void setUp() throws Exception {
		arabicToRomanNumeralConverter = new ArabicToRomanNumeralConverter();
	}

	@After
	public void tearDown() throws Exception {
		arabicToRomanNumeralConverter = null;
	}

	@Test
	public void test_convert_takes_1_should_return_I() {
		int arabicNumber = 1;
		String expectedOutcome = "I";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_2_should_return_II() {
		int arabicNumber = 2;
		String expectedOutcome = "II";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

}
