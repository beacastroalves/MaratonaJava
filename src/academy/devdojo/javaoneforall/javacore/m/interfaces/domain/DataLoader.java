package academy.devdojo.javaoneforall.javacore.m.interfaces.domain;

public interface DataLoader {
  public static final int MAX_DATA_SIZE = 10;
  public abstract void load();

  public default void checkPermission() {
    System.out.println("Checking permission general");
  }

  public static void retrieveMaxDataSize() {
    System.out.println("Inside retrieveMaxDataSize in the interface");
  }
}
