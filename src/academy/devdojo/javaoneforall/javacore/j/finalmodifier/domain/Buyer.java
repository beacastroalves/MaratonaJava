package academy.devdojo.javaoneforall.javacore.j.finalmodifier.domain;

public class Buyer {

  private String name;

  @Override
  public String toString() {
    return "Buyer{" +
        "name='" + name + '\'' +
        '}';
  }

  public Buyer() {

  }

  public Buyer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
