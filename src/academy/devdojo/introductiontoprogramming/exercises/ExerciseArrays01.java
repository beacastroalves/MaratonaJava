package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;
/*
  Create an algorithm that asks the user how many grades he wants to input
  Then asks the grades one by one it reaches the amount he chose and store it in an array
  Show the average at the end
*/
public class ExerciseArrays01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many grades would you like to input");
    int gradesAmount = input.nextInt();
    double[] grades = new double[gradesAmount];
    // [][][]

    for (int i = 0; i < grades.length; i++) {
      System.out.println("Input the grade n. " + (i + 1));
      grades[i] = input.nextDouble();
    }
    double gradesSum = 0;
    for (int i = 0; i < grades.length; i++) {
      // grade[0] =
      System.out.println("Grade [" + (i + 1) + "] = " + grades[i]);
      gradesSum = gradesSum + grades[i];
    }

    System.out.println("Average " + (gradesSum/grades.length));
    System.out.println(gradesSum);
  }
}
