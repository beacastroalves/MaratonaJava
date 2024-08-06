package academy.devdojo.javaoneforall.javacore.m.interfaces.domain;

public interface DataLoader {
  public abstract void load();

  public default void checkPermission() {
    System.out.println("Checking permission general");
  }

}
