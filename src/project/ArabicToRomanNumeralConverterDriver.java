package project;

public class ArabicToRomanNumeralConverterDriver {

	public static void main(String[] args) {
		ArabicToRomanNumeralConverter arabicToRomanNumeralConverter =
				new ArabicToRomanNumeralConverter();
		int arabicNumber;
		System.out.println("Welcome to the Arabic to Roman Numerals Converter");
		arabicNumber = InputHelper.getInt("Enter a number less than 10: ");
		System.out.println(arabicNumber + " = "
						+ arabicToRomanNumeralConverter.convert(arabicNumber));
	}

}
