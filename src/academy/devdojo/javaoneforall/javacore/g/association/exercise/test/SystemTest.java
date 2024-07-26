package academy.devdojo.javaoneforall.javacore.g.association.exercise.test;

import academy.devdojo.javaoneforall.javacore.g.association.exercise.domain.Place;
import academy.devdojo.javaoneforall.javacore.g.association.exercise.domain.Professor;
import academy.devdojo.javaoneforall.javacore.g.association.exercise.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.g.association.exercise.domain.Student;

public class SystemTest {
  public static void main(String[] args) {
    Place place = new Place("Rua Amalia Rodrigues, 5");
    Student student = new Student("Bea",32);
    Student student2 = new Student("Derick",23);
    Student[] seminarStudents = {student, student2};
    Seminar seminar = new Seminar("Java oneForAll", seminarStudents, place);
    Seminar[] availabeSeminars = {seminar};
    Professor professor = new Professor("DevDojo", "Java Development", availabeSeminars);

    professor.print();
  }
}
