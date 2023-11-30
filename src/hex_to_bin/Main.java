package hex_to_bin;

import java.util.Scanner;

import hex_to_bin.bin_convertor.BinaryToHexTransformation;
import hex_to_bin.hex_converter.HexToBinaryTransformation;

public class Main {
	
	public static BinaryToHexTransformation binTransformation = new BinaryToHexTransformation();
	public static HexToBinaryTransformation hexTransformation = new HexToBinaryTransformation();

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			
			// ввод двоичного числа.
			// ввывод результата конвертации двоичного числа.
			System.out.println("Введите двоичное число");
			String binaryConvertResult = convertBinNumber(console);
			String binaryNumber = binTransformation.getBinaryNormalNumber();
			System.out.printf("Двоичное число 0b%s равно шестнадцатеричному числу 0x%s  %n%n", binaryNumber, binaryConvertResult);

			// ввод шестнадцатеричного числа.
			// ввывод результата конвертации 16-ричного числа.
			System.out.println("Введите шестнадцатеричное число");
			String hexConvertResult = convertHexNumber(console);
			String hexNumber = hexTransformation.getHexNumber();
			System.out.printf("Шестнадцатеричное число 0x%s равно двоичному числу 0b%s ", hexNumber, hexConvertResult);
		}
	}

	private static String convertBinNumber(Scanner console) {
		while (true) {
			try {
				return binTransformation.transformation(console.next());
			} catch (RuntimeException e) {
				System.out.println("ошибка ввода, еще раз ");
			}
		}
	}

	private static String convertHexNumber(Scanner console) {
		while (true) {
			try {
				return hexTransformation.transformation(console.next());
			} catch (RuntimeException e) {
				System.out.println("ошибка ввода, еще раз ");
			}
		}
	}
}