package project;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumeralConverter {
	private final Map<Integer, String> arabicToRomanNumeralMap = new HashMap<>();
	{
		arabicToRomanNumeralMap.put(1, "I");
		arabicToRomanNumeralMap.put(2, "II");
		arabicToRomanNumeralMap.put(3, "III");
		arabicToRomanNumeralMap.put(4, "IV");
		arabicToRomanNumeralMap.put(5, "V");
		arabicToRomanNumeralMap.put(6, "VI");
		arabicToRomanNumeralMap.put(7, "VII");
		arabicToRomanNumeralMap.put(8, "VIII");
		arabicToRomanNumeralMap.put(9, "IX");
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

	public String convert(Integer arabicNumber){
		// Magic to do the conversion
		int millionsDigit =  arabicNumber / 1000000;
		arabicNumber = arabicNumber - (millionsDigit * 1000000);
		int hundredThousandsDigit =  arabicNumber / 100000;
		arabicNumber = arabicNumber - (hundredThousandsDigit * 100000);
		int tenThousandsDigit =  arabicNumber / 10000;
		arabicNumber = arabicNumber - (tenThousandsDigit * 10000);
		int thousandsDigit =  arabicNumber / 1000;
		arabicNumber = arabicNumber - (thousandsDigit * 1000);
		int hundredsDigit =  arabicNumber / 100;
		arabicNumber = arabicNumber - (hundredsDigit * 100);
		int tensDigit =  arabicNumber / 10;
		int onesDigit = arabicNumber % 10;

		StringBuilder romanNumeral = new StringBuilder();
		switch (millionsDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000000));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000000));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000000));
			break;
		default:
			break;
		}
		switch (hundredThousandsDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500000));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500000));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000000));
			break;
		default:
			break;
		}
		switch (tenThousandsDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50000));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50000));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100000));
			break;
		default:
			break;
		}

		switch (thousandsDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(5000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10000));
			break;
		default:
			break;
		}
		switch (hundredsDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(500));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(1000));
			break;
		default:
			break;
		}


		switch (tensDigit) {
		case 1:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 2:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 3:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 4:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50));
			break;
		case 5:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50));
			break;
		case 6:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 7:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 8:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(50));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			break;
		case 9:
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(10));
			romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(100));
			break;
		default:
			break;
		}

		romanNumeral = romanNumeral.append(arabicToRomanNumeralMap.get(onesDigit));
		return romanNumeral.toString();
	}


}
