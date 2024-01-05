package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalsStatement04 {
    // €0         to    €34,712     9,70%
    // €34,713    to    €68,507     37,35%
    // €68,508    to    up          49,50%

  public static void main(String[] args) {
    double annualSalary = 70000;
    double firstBracket = 9.70 / 100;
    double secondBracket = 37.35 / 100;
    double thirdBracket = 49.50 / 100;
    double amountToBePaid;

    if (annualSalary <= 34712) {
      amountToBePaid = annualSalary * firstBracket;
    } else if (annualSalary >= 34713 && annualSalary <= 68507) {
      amountToBePaid = annualSalary * secondBracket;
    } else {
      amountToBePaid = annualSalary * thirdBracket;
    }
    System.out.println(amountToBePaid);
  }
}
