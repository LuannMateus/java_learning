package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
  public static void main(String[] args) {
    // type erasure
    List<String> list = new ArrayList<>();

    list.add("String");
    list.add("String");
    list.add("Luan Mateus");

    for (String item : list) {
      System.out.println(item);
    }

    add(list, 1L);
  }

  public static void add(List list, Long l) {
    // list.add(l); Will be throw run time exception
  }
}
