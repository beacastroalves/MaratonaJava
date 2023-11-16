package academy.devdojo.introductiontoprogramming;

public class Conditionals07 {
  public static void main(String[] args) {
    float income = 1000.0F;

    if(income <= 9550) {
      System.out.println("10% = " + (income * 0.1));
    } else if (income >= 9551 && income <= 40525) {
      System.out.println("12% = " + (income * 0.12));
    } else if (income >= 40526 && income <= 86375) {
      System.out.println("22% = " + (income * 0.22));
    } else if (income >= 86376 && income <= 164925) {
      System.out.println("24% = " + (income * 0.24));
    } else if (income >= 164926 && income <= 209425) {
      System.out.println("32% = " + (income * 0.32));
    } else if (income >= 209426 && income <= 523600 ) {
      System.out.println("35% = " + (income * 0.35));
    } else {
      System.out.println("37% = " + (income * 0.37));
    }

  }
}
