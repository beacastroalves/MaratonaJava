package academy.devdojo.javaoneforall.javacore.m.interfaces.domain;

public class DatabaseLoader implements DataLoader {
  @Override
  public void load() {
    System.out.println("Loading data from database");
  }
}
