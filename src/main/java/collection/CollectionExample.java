package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExample {
  public static void main(String[] args) {
    Collection<String> names = Set.of("John", "Pedro", "John");

    System.out.println(names);
  }
}
