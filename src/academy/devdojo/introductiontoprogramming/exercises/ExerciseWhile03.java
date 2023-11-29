package academy.devdojo.introductiontoprogramming.exercises;

import java.util.Scanner;

/*
  Create a program that will show a menu to the use asking for a username and then a password
  The correct username and password must be stored already in variables
  otherwise it should print "ACCESS DENIED" and ask the username and password again.
  This combination should keep going until the user enter the correct username and password
* */
public class ExerciseWhile03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String username = "bca8001";
    String password = "BR1502";

    while (true) {
      System.out.println("Username");
      String usernameType = scanner.nextLine();

      System.out.println("Password");
      String passwordType = scanner.nextLine();

      if (username.equals(usernameType) && password.equals(passwordType)) {
        System.out.println("ACCESS GRANTED");
        break;
      }
      System.out.println("ACCESS DENIED");
    }

    System.out.println("Program finished");
  }
}
