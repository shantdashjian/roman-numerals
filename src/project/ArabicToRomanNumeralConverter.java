package project;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumeralConverter {
	private final Map<String, String> arabicToRomanNumeralMap = new HashMap<>();
	{
		arabicToRomanNumeralMap.put("1", "I");
		arabicToRomanNumeralMap.put("2", "II");
		arabicToRomanNumeralMap.put("3", "III");
		arabicToRomanNumeralMap.put("4", "IV");
		arabicToRomanNumeralMap.put("5", "V");
		arabicToRomanNumeralMap.put("6", "VI");
		arabicToRomanNumeralMap.put("7", "VII");
		arabicToRomanNumeralMap.put("8", "VIII");
		arabicToRomanNumeralMap.put("9", "IX");
		arabicToRomanNumeralMap.put("10", "X");
		arabicToRomanNumeralMap.put("50", "L");
		arabicToRomanNumeralMap.put("100", "C");
		arabicToRomanNumeralMap.put("500", "D");
		arabicToRomanNumeralMap.put("1000", "M");
		arabicToRomanNumeralMap.put("5000", "V\u0305");
		arabicToRomanNumeralMap.put("10000", "X\u0305");
		arabicToRomanNumeralMap.put("50000", "L\u0305");
		arabicToRomanNumeralMap.put("100000", "C\u0305");
		arabicToRomanNumeralMap.put("500000", "D\u0305");
		arabicToRomanNumeralMap.put("1000000", "M\u0305");
	}


	/**
	 *
	 */
	public ArabicToRomanNumeralConverter() {

		// TODO Auto-generated constructor stub
	}

	public String convert(int arabicNumber){
		// Magic to do the conversion

		return arabicToRomanNumeralMap.get(Integer.toString(arabicNumber));
	}


}
