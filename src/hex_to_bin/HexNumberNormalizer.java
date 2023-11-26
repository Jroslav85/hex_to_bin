package hex_to_bin;

public class HexNumberNormalizer implements Normalizer {

    @Override
    public String getCorrectNumber(String number) throws Exception {
        if (number.matches("^[1-9a-f][\\da-f]*$")) {
            return number;
        } else {
            throw new Exception();
        }
    }
}
