package academy.devdojo.javaoneforall.javacore.g.association.test;

import academy.devdojo.javaoneforall.javacore.g.association.domain.Player;

public class PlayerTest01 {
  public static void main(String[] args) {
    Player p1 = new Player("Pele");
    Player p2 = new Player("Ronaldo");
    Player p3 = new Player("Cafu");
    Player p4 = new Player("Roberto Carlos");

    Player[] players = {p1, p2, p3, p4};

    for (Player player : players) {
      player.print();
    }
  }
}
