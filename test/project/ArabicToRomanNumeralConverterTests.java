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

	@Test
	public void test_convert_takes_11_should_return_XI() {
		int arabicNumber = 11;
		String expectedOutcome = "XI";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_12_should_return_XII() {
		int arabicNumber = 12;
		String expectedOutcome = "XII";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_19_should_return_XIX() {
		int arabicNumber = 19;
		String expectedOutcome = "XIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}
	@Test
	public void test_convert_takes_22_should_return_XXII() {
		int arabicNumber = 22;
		String expectedOutcome = "XXII";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_29_should_return_XXIX() {
		int arabicNumber = 29;
		String expectedOutcome = "XXIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_33_should_return_XXXIII() {
		int arabicNumber = 33;
		String expectedOutcome = "XXXIII";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_49_should_return_XLIX() {
		int arabicNumber = 49;
		String expectedOutcome = "XLIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_99_should_return_XCIX() {
		int arabicNumber = 99;
		String expectedOutcome = "XCIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_149_should_return_CXLIX() {
		int arabicNumber = 149;
		String expectedOutcome = "CXLIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_499_should_return_CDXCIX() {
		int arabicNumber = 499;
		String expectedOutcome = "CDXCIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_999_should_return_CMXCIX() {
		int arabicNumber = 999;
		String expectedOutcome = "CMXCIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_2999_should_return_MMCMXCIX() {
		int arabicNumber = 2999;
		String expectedOutcome = "MMCMXCIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}

	@Test
	public void test_convert_takes_8939_should_return_V\u0305MMMCMXXXIX() {
		int arabicNumber = 8939;
		String expectedOutcome = "V\u0305MMMCMXXXIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}
	@Test
	public void test_convert_takes_18939_should_return_X\u0305V\u0305MMMCMXXXIX() {
		int arabicNumber = 18939;
		String expectedOutcome = "X\u0305V\u0305MMMCMXXXIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}
	@Test
	public void test_convert_takes_118939_should_return_C\u0305X\u0305V\u0305MMMCMXXXIX() {
		int arabicNumber = 118939;
		String expectedOutcome = "C\u0305X\u0305V\u0305MMMCMXXXIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}
	@Test
	public void test_convert_takes_1118939_should_return_M\u0305C\u0305X\u0305V\u0305MMMCMXXXIX() {
		int arabicNumber = 1118939;
		String expectedOutcome = "M\u0305C\u0305X\u0305V\u0305MMMCMXXXIX";
		assertEquals(expectedOutcome, arabicToRomanNumeralConverter.convert(arabicNumber));
	}
}
