package hex_to_bin;

public class BinaryNumberNormalizer implements Normalizer {

    @Override
    public String getCorrectNumber(String number) throws Exception {
        if (number.matches("^[01]+$")) {
            return getBinaryNumberRepresentation(number);
        } else {
            // FIXME: 29.11.2023 так не стоит делать почти никогда.
            //  Для ошибок исполнения стоит использовать RuntimeException - он unchecked,
            //  т.е. не требует обязательного отлавливания и throws блока.
            //  Кроме того, непонятно, зачем здесь else - из-за return в if программа и так сюда не дойдет, если зайдет в if
            throw new Exception();
        }
    }

    private String getBinaryNumberRepresentation(String number) {
        // FIXME: 29.11.2023 можно заменить на тернарку
        if (number.length() % 4 != 0) {
            number = "0".repeat(4 - number.length() % 4) + number;
        }
        return number;
    }
}
