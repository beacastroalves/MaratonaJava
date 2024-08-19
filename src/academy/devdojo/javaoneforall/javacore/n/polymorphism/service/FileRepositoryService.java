package academy.devdojo.javaoneforall.javacore.n.polymorphism.service;

import academy.devdojo.javaoneforall.javacore.n.polymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
  @Override
  public void save() {
    System.out.println("Saving in the a file");
  }
}
