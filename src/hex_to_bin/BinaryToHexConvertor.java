package hex_to_bin;

import java.util.Map;

import static java.util.Map.entry;

public class BinaryToHexConvertor implements Convertor {

    private static final Map<String, String> MASK_BIN = Map.ofEntries(entry("0000", "0"), entry("0001", "1"),
            entry("0010", "2"), entry("0011", "3"), entry("0100", "4"), entry("0101", "5"), entry("0110", "6"),
            entry("0111", "7"), entry("1000", "8"), entry("1001", "9"), entry("1010", "a"), entry("1011", "b"),
            entry("1100", "c"), entry("1101", "d"), entry("1110", "e"), entry("1111", "f"));

    @Override
    public String convert(String number) {
        String hexString = "";
        String[] binaryArray = number.split("(?<=\\G.{" + 4 + "})");
        for (String str : binaryArray) {
            // FIXME: 29.11.2023 String неизмен€ем,
            //  т.е. ты в каждой итерации создаешь новую строку.
            //  ћожно заменить на StringBuilder, это дешевле по ресурсам
            hexString += MASK_BIN.get(str);
        }
        return hexString;
    }
}
