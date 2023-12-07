package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

/*
  Calculate the trace of a square matrix
*/
public class ExerciseMultiArray01 {
  public static void main(String[] args) {
    int[][] matrixArray = new int[3][3];
    Scanner input = new Scanner(System.in);
    int trace = 0;
    for (int i = 0; i < matrixArray.length; i++) {
      for (int j = 0; j < matrixArray[i].length; j++) {
        System.out.printf("[%d][%d] = %n", i, j);
        matrixArray[i][j] = input.nextInt();
      }
    }

    for (int i = 0; i < matrixArray.length; i++) {
      for (int j = 0; j < matrixArray[i].length; j++) {
        System.out.printf("[%d][%d] = %d%n", i, j, matrixArray[i][j]);
        if(i==j) {
          trace += matrixArray[i][j];
        }
      }
    }
    System.out.printf("Trace is %d ", trace);
  }
}
