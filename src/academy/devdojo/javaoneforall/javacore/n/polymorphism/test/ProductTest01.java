package academy.devdojo.javaoneforall.javacore.n.polymorphism.test;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.service.ProductTaxReportService;

public class ProductTest01 {
  public static void main(String[] args) {
    Computer computer = new Computer("NUC10i7", 1000);
    Tomato tomato = new Tomato("Italian", 5);

    ProductTaxReportService.generateComputerTaxReport(computer);
    System.out.println("---------------------------");
    ProductTaxReportService.generateTomatoTaxReport(tomato);

  }
}
