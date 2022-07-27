package sorting;

import java.util.stream.Collectors;

public class BurritoStream {
  public static void main(String[] args) {
    new BurritoStream().run();
  }

  private void run() {
    //@formatter:off
    String burritos = Burrito.getBurritos().stream()
    .map(Burrito::toString)
    .sorted()
    .collect(Collectors.joining(", "));
    //Formatter:on
    System.out.println(burritos);
    
  }

}
