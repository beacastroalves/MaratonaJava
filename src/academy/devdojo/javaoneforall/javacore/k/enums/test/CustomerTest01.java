package academy.devdojo.javaoneforall.javacore.k.enums.test;

import academy.devdojo.javaoneforall.javacore.k.enums.domain.Customer;
import academy.devdojo.javaoneforall.javacore.k.enums.domain.PaymentType;
import academy.devdojo.javaoneforall.javacore.k.enums.domain.CustomerType;

public class CustomerTest01 {
  public static void main(String[] args) {
    Customer customer1 = new Customer("Jose", CustomerType.INDIVIDUAL, PaymentType.CREDIT);
    Customer customer2 = new Customer("Joao", CustomerType.COMPANY, PaymentType.DEBIT);
    Customer customer3 = new Customer("Joana", CustomerType.START_UP, PaymentType.CREDIT);
    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(customer3);
    System.out.println(PaymentType.DEBIT.calculateDiscount(100));
    System.out.println(PaymentType.CREDIT.calculateDiscount(100));

  }
}
