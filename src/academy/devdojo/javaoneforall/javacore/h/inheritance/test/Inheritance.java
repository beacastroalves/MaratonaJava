package academy.devdojo.javaoneforall.javacore.h.inheritance.test;

import academy.devdojo.javaoneforall.javacore.h.inheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.h.inheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.h.inheritance.domain.Manager;

public class Inheritance {
  public static void main(String[] args) {
    Address address = new Address();
    address.setStreet("Rua Prof Gomes de Matos, 522");
    address.setZipcode("12345");
    Employee employee = new Employee();
    employee.setName("Maria");
    employee.setSocialSecurityNumber("120120120");
    employee.setSalary(120000);
    employee.setAddress(address);

    employee.print();

    System.out.println(" -------------- ");

    Manager manager = new Manager();
    manager.setName("Joana");
    manager.setSocialSecurityNumber("951951");
    manager.setSalary(250000);
    manager.setAddress(address);
    manager.setDepartment("IT");
    manager.print();

  }

}
