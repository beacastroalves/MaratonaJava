package academy.devdojo.javaoneforall.javacore.d.constructor.test;

import academy.devdojo.javaoneforall.javacore.d.constructor.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime anime = new Anime("Naruto", "TV", 12, "finished");
    Anime anime2 = new Anime();
    anime.print();
    System.out.println("------------");
    anime2.print();
  }
}
