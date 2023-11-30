package hex_to_bin.bin_convertor;

import hex_to_bin.TransformationManagement;

public class BinaryToHexTransformation implements TransformationManagement {
	
	private BinaryNumberNormalizer binaryNumberNormalizer;

	@Override
	public String transformation(String number) {
		this.binaryNumberNormalizer = new BinaryNumberNormalizer(number);
		return new BinaryToHexConvertor().convert(this.binaryNumberNormalizer.getCorrectNumber());    
	}

	public String getBinaryNormalNumber() {
		return this.binaryNumberNormalizer.getCorrectNumber();
	}
}
