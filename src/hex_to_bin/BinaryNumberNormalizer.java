package hex_to_bin;

//FIXME: 18.11.2023 если твои классы получают на вход данные и отдают измененные данные - это точно валидаторы?
// Normalizer 
public class BinaryNumberNormalizer implements Normalizer {
 private String binaryNumber;

 // constructor
 public BinaryNumberNormalizer(String binaryNumber) {
     this.binaryNumber = binaryNumber;
 }

 // methods
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

 // getter and setter
 public String getBinaryNumber() {
     return binaryNumber;
 }

 public void setBinaryNumber(String binaryNumber) {
     this.binaryNumber = binaryNumber;
 }
}

