package academy.devdojo.introductiontoprogramming.exercises;

public class ExerciseSalaryTax {
  public static void main(String[] args) {
    float salary = 5450.89F;
    float taxPercentage = 30;
    float taxAmountFromSalary = salary * (taxPercentage / 100);
    System.out.println("The amount is: " + taxAmountFromSalary);

  }
}
