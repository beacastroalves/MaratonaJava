package academy.devdojo.javaoneforall.javacore.n.polymorphism.service;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Product;

public class ProductTaxReportService {

  public static void generateTaxReport(Product product) {
    System.out.println("Starting the report");
    double taxValue = product.calculateTaxValue();
    System.out.println("Tomato " + product.getName());
    System.out.println("Price " + product.getPrice());
    System.out.println("Tax Value " + taxValue);
  }
}
