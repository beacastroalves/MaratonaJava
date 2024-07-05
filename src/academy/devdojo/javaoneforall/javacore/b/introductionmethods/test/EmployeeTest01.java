package academy.devdojo.javaoneforall.javacore.b.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.b.introductionmethods.domain.Employee;

public class EmployeeTest01 {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setName("Sanji");
    employee.setAge(21);
    employee.setSalaries(new double[] {987.90, 2000, 1250.98});

    employee.print();
    System.out.println(employee.getAverage());
  }
}
