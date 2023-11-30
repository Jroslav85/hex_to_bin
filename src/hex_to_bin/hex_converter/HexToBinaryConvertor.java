package hex_to_bin.hex_converter;

import static java.util.Map.entry;
import java.util.Map;

import hex_to_bin.Convertor;

class HexToBinaryConvertor implements Convertor {
	
	private static final Map<String, String> MASK_HEX = Map.ofEntries(entry("0", "0000"), entry("1", "0001"),
			entry("2", "0010"), entry("3", "0011"), entry("4", "0100"), entry("5", "0101"), entry("6", "0110"),
			entry("7", "0111"), entry("8", "1000"), entry("9", "1001"), entry("a", "1010"), entry("b", "1011"),
			entry("c", "1100"), entry("d", "1101"), entry("e", "1110"), entry("f", "1111"));

	@Override
	public String convert(String number) {
		StringBuilder binaryString = new StringBuilder();
		String[] hexArray = number.split("");
		for (String str : hexArray) {
			binaryString.append(MASK_HEX.get(str));
		}
		return binaryString.toString();
	}
}
