package academy.devdojo.introductiontoprogramming.exercises;

public class ExerciseConditionals01 {
  public static void main(String[] args) {
    double salary = 10000;
    double result = 0;
    String message = "";

    if (salary > 5000) {
      message = "30%: ";
      result = salary * 0.3;

    } else {
      message = "15%: ";
      result = salary * 0.15;
    }

    System.out.println("The value is " + message + result);

  }
}
