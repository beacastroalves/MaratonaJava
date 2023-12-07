package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

public class ExerciseFor04Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    int optionMath = 1;
    while (optionMath != 0) {
      System.out.println("Choose the math option\n" +
          "1 - Sum\n" +
          "2 - Subtraction\n" +
          "3 - Multiplication\n" +
          "4 - Division\n" +
          "0 - Exit");

      optionMath = input.nextInt();
      switch (optionMath) {
        case 1:
          System.out.println("Sum, ok. Type the first number");
          n1 = input.nextInt();
          System.out.println("Type the second number");
          n2 = input.nextInt();
          System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
          System.out.println("------------------------------");
          break;
        case 2:
          System.out.println("Subtraction, ok. Type the first number");
          n1 = input.nextInt();
          System.out.println("Type the second number");
          n2 = input.nextInt();
          System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
          System.out.println("------------------------------");
          break;
        case 3:
          System.out.println("Multiplication, ok. Type the first number");
          n1 = input.nextInt();
          System.out.println("Type the second number");
          n2 = input.nextInt();
          System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
          System.out.println("------------------------------");
          break;
        case 4:
          System.out.println("Division, ok. Type the first number");
          float d1 = input.nextInt();
          System.out.println("Type the second number");
          float d2 = input.nextInt();
          System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
          System.out.println("------------------------------");
          break;
        default:
          if (optionMath != 0) {
            System.out.println("Option invalid. Try again");
            System.out.println("------------------------------");
          }
      }
    }
  }
}
