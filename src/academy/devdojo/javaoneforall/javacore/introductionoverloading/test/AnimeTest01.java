package academy.devdojo.javaoneforall.javacore.introductionoverloading.test;

import academy.devdojo.javaoneforall.javacore.introductionoverloading.domain.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
    Anime anime = new Anime();
    anime.init("Akudama Drive", "TV", 12, "finished");
    anime.print();
  }
}
