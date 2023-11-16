package academy.devdojo.introductiontoprogramming;

public class Conditionals06 {
  public static void main(String[] args) {


    float ps5Price = 500;
    double creditCardAvailableCredit = 5000;
    double checkinAccountValue = 400;
    double savingAccountValue = 200;

    if
    (creditCardAvailableCredit > ps5Price || checkinAccountValue > ps5Price || savingAccountValue > ps5Price) {
      System.out.println("I can buy a PS5");
    } else {
      System.out.println("Cannot buy");
    }
  }
}
