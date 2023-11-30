package hex_to_bin.bin_convertor;

import hex_to_bin.Normalizer;

class BinaryNumberNormalizer implements Normalizer {
	
	private String binaryNumber;
	
	// Constructor
	BinaryNumberNormalizer(String number) throws RuntimeException {
		setCorrectNumber(number);
	}
	
	@Override
	public String getCorrectNumber() throws RuntimeException {
		return this.binaryNumber;
	}
	
	private String setCorrectNumber(String number) throws RuntimeException {
		if (number.matches("^[01]+$")) {
			return this.binaryNumber = getBinaryNumberRepresentation(number);
		}
		throw new RuntimeException();
	}

	private String getBinaryNumberRepresentation(String number) {
		return number.length() % 4 != 0 ? "0".repeat(4 - number.length() % 4) + number : number;
	}
}
