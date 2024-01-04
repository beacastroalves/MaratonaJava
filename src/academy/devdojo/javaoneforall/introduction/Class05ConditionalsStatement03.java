package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalsStatement03 {
  public static void main(String[] args) {
    // if salary > 2000 "buy ps5" "Don't buy ps5"
    double salary = 3000D;
    String shouldBuyMessage = "Buy ps5";
    String shouldNotBuyMessage = "Don't buy ps5";
    // (condition) ? <true> : <false>
    String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;
    
    System.out.println(displayMessage);
  }
}
