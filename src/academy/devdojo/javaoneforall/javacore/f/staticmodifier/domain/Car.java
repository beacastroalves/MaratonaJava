package academy.devdojo.javaoneforall.javacore.f.staticmodifier.domain;

public class Car {

  private String name;
  private double maxSpeed;
  public static double speedLimit = 250;

  public Car(String name, double maxSpeed) {
    this.name = name;
    this.maxSpeed = maxSpeed;
  }

  public void print() {
    System.out.println("----------------------");
    System.out.println("Name " + this.name);
    System.out.println("Max Speed " + this.maxSpeed);
    System.out.println("Speed Limit " + this.speedLimit);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }


}
