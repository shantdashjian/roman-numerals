package project;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumeralConverter {
	private final Map<Integer, String> arabicToRomanNumeralMap = new HashMap<>();
	{
		arabicToRomanNumeralMap.put(1, "I");
		arabicToRomanNumeralMap.put(5, "V");
		arabicToRomanNumeralMap.put(10, "X");
		arabicToRomanNumeralMap.put(50, "L");
		arabicToRomanNumeralMap.put(100, "C");
		arabicToRomanNumeralMap.put(500, "D");
		arabicToRomanNumeralMap.put(1000, "M");
		arabicToRomanNumeralMap.put(5000, "V\u0305");
		arabicToRomanNumeralMap.put(10000, "X\u0305");
		arabicToRomanNumeralMap.put(50000, "L\u0305");
		arabicToRomanNumeralMap.put(100000, "C\u0305");
		arabicToRomanNumeralMap.put(500000, "D\u0305");
		arabicToRomanNumeralMap.put(1000000, "M\u0305");
	}

	/**
	 *
	 */
	public ArabicToRomanNumeralConverter() {

		// TODO Auto-generated constructor stub
	}

	public String convert(Integer arabicNumber) {
		StringBuilder romanNumeral = new StringBuilder();
		for (int positionalWeight = 1000000; positionalWeight >= 1; positionalWeight /= 10) {
			int digit = arabicNumber / positionalWeight;
			arabicNumber = arabicNumber - (digit * positionalWeight);
			romanNumeral = appendRomanNumeral(digit, positionalWeight, romanNumeral);
		}
		return romanNumeral.toString();
	}

	public StringBuilder appendRomanNumeral(int digit, int positionalWeight, StringBuilder stringBuilder) {
		switch (digit) {
		case 1:
		case 2:
		case 3:
			for (int i = 0; i < digit; i++) {
				stringBuilder.append(arabicToRomanNumeralMap.get(positionalWeight));
			}
			break;
		case 4:
			stringBuilder.append(arabicToRomanNumeralMap.get(positionalWeight));
			stringBuilder.append(arabicToRomanNumeralMap.get(5 * positionalWeight));
			break;
		case 5:
			stringBuilder.append(arabicToRomanNumeralMap.get(digit * positionalWeight));
			break;
		case 6:
		case 7:
		case 8:
			stringBuilder.append(arabicToRomanNumeralMap.get(5 * positionalWeight));
			for (int i = 0; i < digit - 5; i++) {
				stringBuilder.append(arabicToRomanNumeralMap.get(positionalWeight));
			}
			break;
		case 9:
			stringBuilder.append(arabicToRomanNumeralMap.get(positionalWeight));
			stringBuilder.append(arabicToRomanNumeralMap.get(positionalWeight * 10));
			break;
		default:
			break;
		}
		return stringBuilder;
	}
}
