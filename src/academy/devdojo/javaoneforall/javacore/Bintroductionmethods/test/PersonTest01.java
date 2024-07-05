package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("Rihana");
    person.setAge(29);
//    person.print();
    System.out.println(person.getName());
    System.out.println(person.getAge());
  }
}
