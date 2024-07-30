package academy.devdojo.javaoneforall.javacore.i.overriding.domain;

public class Anime {
  private String Name;

  @Override
  public String toString() {
    return "Anime{" +
        "Name='" + Name + '\'' +
        '}';
  }

  public Anime(String name) {
    Name = name;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }
}
