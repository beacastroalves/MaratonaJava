package academy.devdojo.javaoneforall.javacore.g.association.test;

import academy.devdojo.javaoneforall.javacore.g.association.domain.Player;
import academy.devdojo.javaoneforall.javacore.g.association.domain.Team;

public class PlayerTest02 {
  public static void main(String[] args) {
    Player player1 = new Player("Pele");
    Team team1 = new Team("Brazil's national team");

    player1.setTeam(team1);
    player1.print();
  }
}
