package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    List<String> superHeroName = new ArrayList<>();
    List<String> villainName = new ArrayList<>();

    // ? Add elements
    superHeroName.add("Super Man");
    villainName.add("Punisher");

    // ? Merge two Arrays List
    superHeroName.addAll(villainName);

    // ? Array List Size
    final Integer arraySize = superHeroName.size();

    // ? Remove a Array List element
    superHeroName.remove(0); // ? With index
    superHeroName.remove("Punisher"); // ? With object

    // ? Clear all elements from Array List
    villainName.clear();

    for (String name : superHeroName) {
      System.out.println(name);
    }

    for (String name : villainName) {
      System.out.println(name);
    }


  }
}
