package academy.devdojo.javaoneforall.javacore.f.staticmodifier.domain;

public class AnimeF {
  private String name;
  private static int[] episodes;

  // 0 - Static init block is executed when JVM loads the class and only once
  // 1 - Memory allocated
  // 2 - Each class attribute is initialized
  // 3 - Init block is executed
  // 4 - The constructor is executed

  static {
    System.out.println("Inside static init block 1");
    episodes = new int[100];
    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
    }
  }

  static {
    System.out.println("Inside static init block 2");
  }

  static {
    System.out.println("Inside static init block 3");
  }

  {
    System.out.println("Inside non-static init block 3");
  }

  public AnimeF(String name) {
    this.name = name;
  }

  public AnimeF() {
    for (int episode : AnimeF.episodes) {
      System.out.print(episode + " ");
    }
    System.out.println();
  }

  public String getName() {
    return name;
  }

  public static int[] getEpisodes() {
    return episodes;
  }

}
