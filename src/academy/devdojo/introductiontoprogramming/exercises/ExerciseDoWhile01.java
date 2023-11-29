package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

/*
  Using do-while, create an algorithm that will accept two distinct number inputs
  If the numbers are equal, print true, if not print false
  Give an option to the player decide if he wants to continue the game or stop after the result
*/
public class ExerciseDoWhile01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int option = 0;

    do {
      System.out.println("Type the first number");
      int number1 = input.nextInt();
      System.out.println("Type the second number");
      int number2 = input.nextInt();

      System.out.println("Are the numbers equal? "  + (number1 == number2));

      System.out.println("----------------------------");
      System.out.println("Would you like to continue");
      System.out.println("1. Yes");
      System.out.println("2. No");
      option = input.nextInt();

    } while (option == 1);

  }
}
