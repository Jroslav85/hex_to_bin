package hex_to_bin.hex_converter;

import hex_to_bin.Normalizer;

class HexNumberNormalizer implements Normalizer {
	
	private String hexNumber;

	// Constructor
	HexNumberNormalizer(String number) throws RuntimeException {
		setCorrectNumber(number);
	}


	@Override
	public String getCorrectNumber() throws RuntimeException {
		return this.hexNumber;
	}
	
	private String setCorrectNumber(String number) throws RuntimeException {
		if (number.matches("^[1-9a-f][\\da-f]*$")) {
			return number;
		} else {
			throw new RuntimeException();
		}
	}
}
