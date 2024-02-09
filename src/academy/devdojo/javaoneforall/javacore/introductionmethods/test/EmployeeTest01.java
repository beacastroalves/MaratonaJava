package academy.devdojo.javaoneforall.javacore.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Employee;

public class EmployeeTest01 {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.name = "Sanji";
    employee.age = 21;
    employee.salaries = new double[] {987.90, 2000, 1250.98};

    employee.print();
  }
}
