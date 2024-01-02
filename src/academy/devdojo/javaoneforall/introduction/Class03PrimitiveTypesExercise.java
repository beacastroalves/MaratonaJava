package academy.devdojo.javaoneforall.introduction;
/*
Create variables for the fields described below between <> and print the following message:

I <name>, living at <address>, confirm that I received the salary of <salary> on <date>
*/

public class Class03PrimitiveTypesExercise {
  public static void main(String[] args) {
    String name = "Beatriz";
    String address = "4 Mira Fernandes";
    double salary = 3100.87;
    String receivedSalaryDate = "28/12/2023";
    String report = "I " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate;
    System.out.println(report);
  }
}
