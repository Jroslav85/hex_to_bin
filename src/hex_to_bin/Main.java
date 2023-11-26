package hex_to_bin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        // ввод двоичного числа.
        System.out.println("Введите двоичное число");
        String binaryNumber = enteringBinNumber(console);

        // ввывод результата конвертации двоичного числа.
        System.out.printf("Двоичное число 0b%s равно шестнадцатеричному числу 0x%s  %n%n",
                binaryNumber, new BinaryToHexConvertor().convert(binaryNumber));

        // ввод шестнадцатеричного числа.
        System.out.println("Введите шестнадцатеричное число");
        String hexNumber = enteringHexNumber(console);

        // ввывод результата конвертации 16-ричного числа.
        System.out.printf("Шестнадцатеричное число 0x%s равно двоичному числу 0b%s ",
                hexNumber, new HexToBinaryConvertor().convert(hexNumber));

        console.close();
    }
	
	private static String enteringBinNumber(Scanner console) {
		String binaryNumber;
        while (true) {
            try {
                BinaryNumberNormalizer bnv = new BinaryNumberNormalizer(
                        console.next());
                binaryNumber = bnv.getCorrectNumber(bnv.getBinaryNumber());
                break;
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }
		return binaryNumber;
	}

	private static String enteringHexNumber(Scanner console) {
		String hexNumber;
        while(true) {
            try {
                HexNumberNormalizer hnv = new HexNumberNormalizer(console.next());
                hexNumber = hnv.getCorrectNumber(hnv.getHexNumber());
                break;
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }
		return hexNumber;
	}


}