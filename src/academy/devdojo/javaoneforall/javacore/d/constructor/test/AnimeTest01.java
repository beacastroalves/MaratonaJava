package academy.devdojo.javaoneforall.javacore.d.constructor.test;

import academy.devdojo.javaoneforall.javacore.d.constructor.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime anime = new Anime("Naruto", "TV", 12, "finished", "Production IG");
    anime.print();

  }
}
