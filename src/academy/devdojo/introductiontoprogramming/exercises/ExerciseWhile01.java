package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

/*
Given a number entered by the user
print all the odd numbers starting from zero until the number given by the user
*/
public class ExerciseWhile01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type a positive number");
    int number = input.nextInt();
    int count = 0;
    while (count <= number) {
      if (count % 2 != 0) {
        System.out.println(count);
      }
      count++;
    }
  }
}


