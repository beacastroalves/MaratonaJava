package academy.devdojo.introductiontoprogramming.conditionals;

public class Conditionals08 {
  public static void main(String[] args) {
    int day = 4;
    if (day == 1) {
      System.out.println("Sunday");
    } else if (day == 2) {
      System.out.println("Monday");
    } else if (day == 3) {
      System.out.println("Tuesday");
    } else if (day == 4) {
      System.out.println("Wednesday");
    } else if (day == 5) {
      System.out.println("Thursday");
    } else if (day == 6) {
      System.out.println("Friday");
    } else {
      System.out.println("Saturday");
    }

    switch (day) {
      case 1:
        System.out.println("Sunday");
      case 2:
        System.out.println("Monday");
      case 3:
        System.out.println("Tuesday");
      case 4:
        System.out.println("Wednesday");
      case 5:
        System.out.println("Thursday");
      case 6:
        System.out.println("Friday");
      case 7:
        System.out.println("Saturday");
    }
  }
}
