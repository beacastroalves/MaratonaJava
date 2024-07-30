package academy.devdojo.javaoneforall.javacore.j.finalmodifier.test;

import academy.devdojo.javaoneforall.javacore.j.finalmodifier.domain.Buyer;
import academy.devdojo.javaoneforall.javacore.j.finalmodifier.domain.Car;

public class CarTest01 {
  public static void main(String[] args) {
    Car car = new Car();
    System.out.println(Car.SPEED_LIMIT);
    System.out.println(car.BUYER);
    car.BUYER.setName("Client");
    System.out.println(car.BUYER);
  }
}
