package sorting;

import java.util.ArrayList;
import java.util.List;

public class Burrito {
  private String name;

  private static List<Burrito> burritos = List.of(
      new Burrito("Chicken"),
      new Burrito("Shrimp"),
      new Burrito("Steak"),
      new Burrito("Pork")       
      );    
  /**
   * @param name
   */
  public Burrito(String name) {
    this.name = name;
     
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return name + " burrito";
  }
  
  public static int compare(Burrito b1, Burrito b2) {
    return b1.name.compareTo(b2.name);
  }
  
/**
 * this returns a list that is modifiable. List.of returns an unmodifiable list. (Sort requires mods)
 * @return the burritos
 */
  
  public static List<Burrito> getBurritos() {
    return new ArrayList<>(burritos);
  }

}
