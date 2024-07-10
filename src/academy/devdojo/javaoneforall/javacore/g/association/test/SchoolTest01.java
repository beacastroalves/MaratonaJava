package academy.devdojo.javaoneforall.javacore.g.association.test;

import academy.devdojo.javaoneforall.javacore.g.association.domain.Professor;
import academy.devdojo.javaoneforall.javacore.g.association.domain.School;

public class SchoolTest01 {
  public static void main(String[] args) {
    Professor professor = new Professor("Antonio");
    Professor professor2 = new Professor("Pedro");
    Professor[] professors = {professor , professor2};
    School school = new School("Rumos", professors);

    school.print();
  }
}
