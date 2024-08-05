package academy.devdojo.javaoneforall.javacore.l.domain.abstractclasses.test;

import academy.devdojo.javaoneforall.javacore.l.domain.abstractclasses.domain.Manager;
import academy.devdojo.javaoneforall.javacore.l.domain.abstractclasses.domain.Developer;
public class EmployeeTest01 {

  public static void main(String[] args) {
    Manager manager = new Manager("Joao", 8000.25);
    System.out.println(manager);
    Developer developer = new Developer("Marcia", 8000.25);
    System.out.println(developer);

    System.out.println("-------------");

    manager.print();
    developer.print();
  }
}
