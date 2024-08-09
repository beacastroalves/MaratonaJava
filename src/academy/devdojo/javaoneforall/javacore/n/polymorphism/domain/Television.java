package academy.devdojo.javaoneforall.javacore.n.polymorphism.domain;

public class Television extends Product {
  public static final double TAX_PERCENTAGE = 0.21;

  public Television(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxValue() {
    System.out.println("Calculating tax value for Television");
    return this.price * TAX_PERCENTAGE;
  }
}
