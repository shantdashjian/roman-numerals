package project;

public class ArabicToRomanNumeralConverterDriver {

	public static void main(String[] args) {
		ArabicToRomanNumeralConverter arabicToRomanNumeralConverter =
				new ArabicToRomanNumeralConverter();
		int arabicNumber;
		System.out.println("Welcome to the Arabic-Hindu Number to Roman Numerals Converter");
		arabicNumber = InputHelper.getInt("Enter a number: ");
		System.out.println(arabicNumber + " = "
						+ arabicToRomanNumeralConverter.convert(arabicNumber));
	}
}
