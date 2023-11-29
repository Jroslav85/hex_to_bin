package hex_to_bin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ввод двоичного числа.
        System.out.println("Введите двоичное число");
        // FIXME: 29.11.2023 enter. ing здесь указывает на герундий,
        //  а методы должны начинаться с глагола
        String binaryNumber = enteringBinNumber(console);

        // ввывод результата конвертации двоичного числа.
        // FIXME: 29.11.2023 длина строки должна оставаться в пределах 120 (или 140, как принято в команде) символов.
        //   бизнес-логика внутри вывода - такое себе.
        //   Лучше впихнуть в переменную. И предлагаю подумать о том, что после ввода в консоль не очень
        //   удобно оперировать наследниками - удобнее было бы определить реализации, которые бы
        //   инкапсулировали в себя работу с нормалайзером и конвертером.
        //   Иначе я каждый раз должен думать о том, с каким нормалайзером какой конвертер юзать
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
                // FIXME: 29.11.2023 не очень понятно, почему нормалайзер - часть логики ввода. Я бы приведение вынес отдельно
                BinaryNumberNormalizer binNormalizer = new BinaryNumberNormalizer();
                return binNormalizer.getCorrectNumber(console.next());
            } catch (Exception e) {
                // FIXME: 29.11.2023 опять же, раунтаймЭксепшн
                System.out.println("ошибка ввода, еще раз ");
            }
        }
    }

    private static String enteringHexNumber(Scanner console) {
        while (true) {
            try {
                HexNumberNormalizer hexNormalizer = new HexNumberNormalizer();
                return hexNormalizer.getCorrectNumber(console.next());
            } catch (Exception e) {
                System.out.println("ошибка ввода, еще раз ");
            }
        }
    }
}