package academy.devdojo.javaoneforall.javacore.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest04 {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int num1 = 1;
    int num2 = 2;
    calculator.changeTwoNumbers(num1, num2);
    System.out.println("Inside changeTwoNumbers");
    System.out.println("Num1 " + num1);
    System.out.println("Num2 " + num2);
  }
}
