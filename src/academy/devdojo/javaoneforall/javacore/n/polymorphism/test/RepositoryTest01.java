package academy.devdojo.javaoneforall.javacore.n.polymorphism.test;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.service.DatabaseRepositoryService;
import academy.devdojo.javaoneforall.javacore.n.polymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
  public static void main(String[] args) {
    DatabaseRepositoryService dbService = new DatabaseRepositoryService();
    dbService.save();

    System.out.println("-----------------------");

    Repository repository = new InMemoryRepositoryService();
    repository.save();
  }
}
