package academy.devdojo.introductiontoprogramming;

/*
  Create a program that allows users to input their username to be saved at a later date
  the username cannot be empyt ("") or be one of the following usernames: admin or administrator in any type of capital letters
  If the user inputs vale data the message: <username> was registered successfully
  Otherwise the system will show the message: Invalid username
*/

import java.util.Scanner;

public class ExerciseConditionals05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String username = input.next();
    System.out.println(username + "was registered successfully");



  }
}
