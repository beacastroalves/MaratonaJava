package academy.devdojo.javaoneforall.javacore.introductionclasses.test;

import academy.devdojo.javaoneforall.javacore.introductionclasses.domain.Professor;

public class ProfessorTest01 {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.name = "Kamila";
    professor.age = 45;
    professor.gender = 'F';

    System.out.println("Name: " + professor.name + "Age: " + professor.age
        + "Gender " +  professor.gender);
  }
}
