package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalsStatement02 {
  public static void main(String[] args) {
    // age < 15 category junior
    // age >= 15  && age < 18 category senior
    // age >= 18 category masters

    int age = 22;
    String category;

    if (age < 15) {
      category = "Category Junior";
    } else if (age >= 15 && age < 18) {
      category = "Category Senior";
    } else {
      category = "Category Master";
    }
    // Never do it!
    category = age < 15 ? "Category Junior" : age >= 15 && age < 18 ? "Category Senior" : "Category Master";
    System.out.println(category);
  }
}
