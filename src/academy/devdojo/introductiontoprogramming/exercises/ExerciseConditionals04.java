package academy.devdojo.introductiontoprogramming.exercises;

/* Given an age, find the best category to fir that person
< 13 = "Kids"
>= 13 and <= 16 = "Juvenile"
> 16 = "Adult"
Restrictions: Only use one System.out.println
 */

import java.util.Scanner;

public class ExerciseConditionals04 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input your age to find you category");
    int age = keyboard.nextInt();
    String category = "";

    if(age < 13) {
      category = "Kids";
    } else if (age >= 13 && age <= 16) {
      category = "Juvenile";
    } else {
      category = "Adult";
    }
    System.out.println("The category is " + category);
  }
}
