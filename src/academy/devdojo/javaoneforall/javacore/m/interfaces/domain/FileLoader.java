package academy.devdojo.javaoneforall.javacore.m.interfaces.domain;

public class FileLoader implements DataLoader {
  @Override
  public void load() {
    System.out.println("Loading data from file");
  }
}
