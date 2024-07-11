package academy.devdojo.javaoneforall.javacore.g.association.test;

import academy.devdojo.javaoneforall.javacore.g.association.domain.Player;
import academy.devdojo.javaoneforall.javacore.g.association.domain.Team;

public class PlayerTest03 {
  public static void main(String[] args) {
    Player player = new Player("Ronaldinho Gaucho");
    Player player2 = new Player("Cafu");
    Team team = new Team("Brazil");
    Player[] players = {player, player2};

    player.setTeam(team);
    player2.setTeam(team);
    team.setPlayers(players);

    System.out.println("--- Player ---");
    player.print();
    player2.print();

    System.out.println("--- team ---");
    team.print();
  }

}
