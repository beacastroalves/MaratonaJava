package academy.devdojo.javaoneforall.javacore.m.interfaces.test;

import academy.devdojo.javaoneforall.javacore.m.interfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.m.interfaces.domain.DatabaseLoader;
import academy.devdojo.javaoneforall.javacore.m.interfaces.domain.FileLoader;

public class DataLoaderTest01 {
  public static void main(String[] args) {
    DatabaseLoader databaseLoader = new DatabaseLoader();
    FileLoader fileLoader = new FileLoader();
    databaseLoader.load();
    fileLoader.load();

    databaseLoader.remove();
    fileLoader.remove();

    databaseLoader.checkPermission();
    fileLoader.checkPermission();

    DataLoader.retrieveMaxDataSize();
    databaseLoader.retrieveMaxDataSize();
  }
}
