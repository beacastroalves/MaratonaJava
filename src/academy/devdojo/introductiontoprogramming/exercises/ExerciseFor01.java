package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

 /*
    Create an algorithm that shows the square numbers from 1 to the number the user typed
 */

public class ExerciseFor01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type a number");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
      System.out.println(i + " * " + i + " = " + (i * i));
    }
  }
}
