package academy.devdojo.javaoneforall.javacore.j.finalmodifier.domain;

public class Car {
  private String name;
  public static final double SPEED_LIMIT = 250;

  public final Buyer BUYER = new Buyer();

  /*
  OPTION 1 - With 'static final' on attribute and static init block
  #0 Static init block from the superclass is executed when JVM loads the class and only once

  public static final double SPEED_LIMIT;

  static {
    SPEED_LIMIT = 250;
  }

  */

  /*
  OPTION 2 - Without 'static final' on attribute and static init block
  #4 - Init block from the superclass is executed in the order they appear

  public final double SPEED_LIMIT;

  {
    SPEED_LIMIT = 250;
  }

  */

  /*
  OPTION 3 - Initialize the attribute inside constructor
  #5 - The constructor from the superclass is executed
  */
  public Car() {
  //    SPEED_LIMIT = 250;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
