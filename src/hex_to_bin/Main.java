package hex_to_bin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        // ввод двоичного числа.
        System.out.println("Введите двоичное число");
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

        // ввывод результата конвертации двоичного числа.
        System.out.printf("Двоичное число 0b%s равно шестнадцатеричному числу 0x%s  %n%n",
                binaryNumber, new BinaryToHexConvertor().convert(binaryNumber));

        // ввод шестнадцатеричного числа.
        String hexNumber;
        System.out.println("Введите шестнадцатеричное число");
        // FIXME: 18.11.2023 почему бы эту историю с цикличным вводом не вынести в отдельный метод?
        while(true) {
            try {
                HexNumberNormalizer hnv = new HexNumberNormalizer(console.next());
                hexNumber = hnv.getCorrectNumber(hnv.getHexNumber());
                break;
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }

        // ввывод результата конвертации 16-ричного числа.
        System.out.printf("Шестнадцатеричное число 0x%s равно двоичному числу 0b%s ",
                hexNumber, new HexToBinaryConvertor().convert(hexNumber));

        console.close();
    }
}