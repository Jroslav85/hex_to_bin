package hex_to_bin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        // ввод двоичного числа.
        System.out.println("Введите двоичное число");
        String binaryNumber = enteringBinNumber(console);

        // ввывод результата конвертации двоичного числа.
        System.out.printf("Двоичное число 0b%s равно шестнадцатеричному числу 0x%s  %n%n", binaryNumber, new BinaryToHexConvertor().convert(binaryNumber));

        // ввод шестнадцатеричного числа.
        System.out.println("Введите шестнадцатеричное число");
        String hexNumber = enteringHexNumber(console);

        // ввывод результата конвертации 16-ричного числа.
        System.out.printf("Шестнадцатеричное число 0x%s равно двоичному числу 0b%s ", hexNumber, new HexToBinaryConvertor().convert(hexNumber));

        console.close();
    }
	
	private static String enteringBinNumber(Scanner console) {
        while (true) {
            try {
                BinaryNumberNormalizer binNormalizer = new BinaryNumberNormalizer();
                return binNormalizer.getCorrectNumber(console.next());
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }
	}

	private static String enteringHexNumber(Scanner console) {
        while(true) {
            try {
                HexNumberNormalizer hexNormalizer = new HexNumberNormalizer();
                return hexNormalizer.getCorrectNumber(console.next());
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }
	}
}