package academy.devdojo.javaoneforall.javacore.e.initializationblock.test;

import academy.devdojo.javaoneforall.javacore.e.initializationblock.domain.Anime;

public class Test01 {
  public static void main(String[] args) {
    Anime anime = new Anime("One Piece");
    for (int episode : anime.getEpisodes()) {
      System.out.print(episode + " ");
    }
  }
}
