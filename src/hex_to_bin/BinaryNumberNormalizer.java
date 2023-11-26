package hex_to_bin;

public class BinaryNumberNormalizer implements Normalizer {

	@Override
	public String getCorrectNumber(String number) throws Exception {
		if (number.matches("^[01]+$")) {
			return getBinaryNumberRepresentation(number);
		} else {
			throw new Exception();
		}
	}

	private String getBinaryNumberRepresentation(String number) {
		if (number.length() % 4 != 0) {
			number = "0".repeat(4 - number.length() % 4) + number;
		}
		return number;
	}
}
