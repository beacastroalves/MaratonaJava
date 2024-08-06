package academy.devdojo.javaoneforall.javacore.m.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
  @Override
  public void load() {
    System.out.println("Loading data from database");
  }

  @Override
  public void remove() {
    System.out.println("Removing data from file");
  }

  @Override
  public void checkPermission() {
    System.out.println("Checking permission in the database");
  }

  public static void retrieveMaxDataSize() {
    System.out.println("Inside retrieveMaxDataSize in the class DatabaseLoader");
  }
}
