package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
  public static void main(String[] args) {
    // int, double, float, boolean, char, byte, short, long
    int age = 10;
    long bigNumber = (long) 155.35;
    float salaryFloat1 = 2500.00F;
    float salaryFloat2 = (float) 2500.00D;
    double salaryDouble = 2500;
    boolean trueValue = true;
    boolean falseValue = false;
    short shortNumber = 32000;
    byte byteNumber = 127;
    char character = '\u0041';
    String name = "Goku";

    System.out.println("The age is: " + age + " years old");
    System.out.println("bigNumber: " + bigNumber);
    System.out.println("salaryFloat1: " + salaryFloat1);
    System.out.println("salaryFloat2: " + salaryFloat2);
    System.out.println("salaryDouble: " + salaryDouble);
    System.out.println("trueValue: " + trueValue);
    System.out.println("falseValue: " + falseValue);
    System.out.println("shortNumber: " + shortNumber);
    System.out.println("byteNumber: " + byteNumber);
    System.out.println("character: " + character);
    System.out.println("Hi I am " + name);
  }
}
