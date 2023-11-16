package academy.devdojo.introductiontoprogramming;

public class Conditionals05 {
  public static void main(String[] args) {
    String savedName = "Alucard";
    String savedCreditCardNumber = "123";
    String savedSecurityCode = "300";

    String inputName = "Alucard";
    String inputCreditCardNumber = "123";
    String inputSecurityCode = "30";

    if (savedName.equals(inputName) && savedCreditCardNumber.equals(inputCreditCardNumber) && savedSecurityCode.equals(inputSecurityCode)) {
      System.out.println("Can buy");
    } else {
      System.out.println("Cannot buy");
    }
  }
}
