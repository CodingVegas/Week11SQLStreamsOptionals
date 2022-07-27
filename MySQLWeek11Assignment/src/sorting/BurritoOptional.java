package sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class BurritoOptional {
  public static void main(String[] args) {
    new BurritoOptional().run();

  }

  private void run() {
    Burrito burrito = burritoMethod(Optional.of(new Burrito("Half Eaten")));
    System.out.println(burrito);
    
    try {
      burritoMethod(Optional.empty());
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
  }
  
  
  private Burrito burritoMethod(Optional<Burrito> optionalBurrito) {
   return optionalBurrito.orElseThrow(() -> new NoSuchElementException("No Burrito!"));
  }

}
