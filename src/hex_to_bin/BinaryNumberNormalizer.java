package hex_to_bin;

public class BinaryNumberNormalizer implements Normalizer {

    @Override
    public String getCorrectNumber(String number) throws Exception {
        if (number.matches("^[01]+$")) {
            return getBinaryNumberRepresentation(number);
        } else {
            // FIXME: 29.11.2023 ��� �� ����� ������ ����� �������.
            //  ��� ������ ���������� ����� ������������ RuntimeException - �� unchecked,
            //  �.�. �� ������� ������������� ������������ � throws �����.
            //  ����� ����, ���������, ����� ����� else - ��-�� return � if ��������� � ��� ���� �� ������, ���� ������ � if
            throw new Exception();
        }
    }

    private String getBinaryNumberRepresentation(String number) {
        // FIXME: 29.11.2023 ����� �������� �� ��������
        if (number.length() % 4 != 0) {
            number = "0".repeat(4 - number.length() % 4) + number;
        }
        return number;
    }
}
