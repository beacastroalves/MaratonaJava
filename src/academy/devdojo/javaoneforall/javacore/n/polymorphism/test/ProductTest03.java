package academy.devdojo.javaoneforall.javacore.n.polymorphism.test;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.service.ProductTaxReportService;

public class ProductTest03 {
  public static void main(String[] args) {
    Product product = new Computer("Ryzen 9", 1000);

    Tomato tomato = new Tomato("Dutch", 6);
    tomato.setBestConsumedBefore("08/12/2024");

    ProductTaxReportService.generateTaxReport(tomato);

    System.out.println("-----------------");

    ProductTaxReportService.generateTaxReport(product);

  }
}
