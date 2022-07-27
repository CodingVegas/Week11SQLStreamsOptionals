package sorting;

import java.util.List;

public class BurritoSorter {

  public static void main(String[] args) {
    new BurritoSorter().run();

  }

  private void run() {
    List<Burrito> lamdaBurritos = sortByLanda();
       System.out.println(lamdaBurritos);
    
  }

  private List<Burrito> sortByLanda() {
    List<Burrito> lamdaBurritos = Burrito.getBurritos();
    lamdaBurritos.sort((b1, b2) -> Burrito.compare(b1, b2));
    return lamdaBurritos;
  
  }

}
