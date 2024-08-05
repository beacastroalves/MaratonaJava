package academy.devdojo.javaoneforall.javacore.l.domain.abstractclasses.domain;

public class Manager extends Employee {

  public Manager(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void calculateBonusSalary() {
    this.salary = this.salary + this.salary * 0.05;
  }

  @Override
  public void print() {
    System.out.println("Printing of Manager");
  }

  @Override
  public String toString() {
    return "Manager {" +
        "name = '" + name + '\'' +
        ", salary = " + salary +
        '}';
  }
}
