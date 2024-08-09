package academy.devdojo.javaoneforall.javacore.n.polymorphism.domain;

public class Tomato extends Product {
  public static final double TAX_PERCENTAGE = 0.06;
  private String bestConsumedBefore;

  public Tomato(String name, double value) {
    super(name, value);
  }


  @Override
  public double calculateTaxValue() {
    System.out.println("Calculating tax value for Tomato");
    return this.price * TAX_PERCENTAGE;
  }

  public String getBestConsumedBefore() {
    return bestConsumedBefore;
  }

  public void setBestConsumedBefore(String bestConsumedBefore) {
    this.bestConsumedBefore = bestConsumedBefore;
  }
}
