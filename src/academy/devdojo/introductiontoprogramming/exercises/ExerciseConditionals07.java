package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

public class ExerciseConditionals07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type a number for the day of the week between 1 and 7. Use 1 for Sunday.");
    int day = input.nextInt();

    switch (day) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Weekday");
        break;
      case 1:
      case 7:
        System.out.println("Weekend");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
