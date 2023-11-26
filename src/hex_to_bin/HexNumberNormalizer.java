package hex_to_bin;

public class HexNumberNormalizer implements Normalizer {
    // FIXME: 18.11.2023 какой смысл у этого поля? Кажется, оно бесполезно
    private String HexNumber;

    // constructor
    public HexNumberNormalizer(String HexNumber) {
        this.HexNumber = HexNumber;
    }

    // methods
    @Override
    public String getCorrectNumber(String number) throws Exception {

        if (number.matches("^[1-9a-f][\\da-f]*$")) {
            return number;
        } else {
            throw new Exception();
        }
    }

    // getter and setter
    public String getHexNumber() {
        return HexNumber;
    }
}
