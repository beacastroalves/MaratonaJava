package academy.devdojo.javaoneforall.javacore.b.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.b.introductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.b.introductionmethods.domain.StudentPrinter;

public class StudentTest01 {

  public static void main(String[] args) {
    Student student01 = new Student();
    Student student02 = new Student();
    StudentPrinter printer = new StudentPrinter();

    student01.name = "Victoria";
    student01.gender = 'F';
    student01.age = 15;

    student02.name = "Sasky";
    student02.gender = 'M';
    student02.age = 22;

    printer.print(student01);
    printer.print(student02);

    System.out.println("#################");

    printer.print(student01);
    printer.print(student02);
  }

}
