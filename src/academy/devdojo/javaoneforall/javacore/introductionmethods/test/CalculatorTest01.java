package academy.devdojo.javaoneforall.javacore.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest01 {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.sumTwoNumbers();
    System.out.println("Finishing sum method");
    calculator.subtractTwoNumbers();
    System.out.println("Finishing class CalculatorTest01");
  }
}
