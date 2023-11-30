package hex_to_bin.hex_converter;

import hex_to_bin.TransformationManagement;

public class HexToBinaryTransformation implements TransformationManagement {
	
	private HexNumberNormalizer hexNumberNormalizer;

	@Override
	public String transformation(String number) {
		this.hexNumberNormalizer = new HexNumberNormalizer(number);
		return new HexToBinaryConvertor().convert(this.hexNumberNormalizer.getCorrectNumber());
	}

	public String getHexNumber() {
		return this.hexNumberNormalizer.getCorrectNumber();
	}

}
