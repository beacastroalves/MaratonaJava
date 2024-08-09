package academy.devdojo.javaoneforall.javacore.n.polymorphism.test;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Tomato;

public class ProductTest02 {
  public static void main(String[] args) {
    Product product1 = new Computer("Ryzen 9", 1000);
    System.out.println(product1.getName());
    System.out.println(product1.getPrice());
    System.out.println(product1.calculateTaxValue());

    System.out.println("---------------");

    Product product2 = new Computer("Nitro 7", 937);
    System.out.println(product2.getName());
    System.out.println(product2.getPrice());
    System.out.println(product2.calculateTaxValue());

    System.out.println("---------------");

    // Widening cast example
    Product product3 = new Tomato("Spanish", 2);
    System.out.println(product2.getName());
    System.out.println(product2.getPrice());
    System.out.println(product2.calculateTaxValue());

    Tomato tomato = new Tomato("Portuguese", 3);
    tomato.getBestConsumedBefore();
  }
}
