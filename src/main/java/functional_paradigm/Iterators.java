package functional_paradigm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterators {
  public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3, 4, 5};

    printFilterNames("Luan", "Luan");
    printAllNames("Luan", "Mateus", "Lima");

    printTheDoubleOfEachListValue(numbers);

    // ? Usando stream das listas
    List<String> professions = new ArrayList<>();

    professions.add("Developer");
    professions.add("Test Engineer");
    professions.add("DevOps");

    professions.stream()
      .filter(profession -> profession.startsWith("Dev"))
      .forEach(System.out::println);
  }

  public static void printFilterNames(String... names) {
    String namesToPrintImperative = "";
    String namesToPrintFunctional = "";

    // ? Imperative
    for (int i = 0; i < names.length; i++) {
      if (names[i].equals("Luan")) {
        namesToPrintImperative += " " + names[i];
      }
    }

    System.out.println(String.format("Names with for: %s", namesToPrintImperative));

    // ? Functional
    // * Usando Stream para aplicar iterações de forma declarativa
    namesToPrintFunctional = Stream.of(names)
      .filter(name -> name.equals("Luan"))
      .collect(Collectors.joining(" "));

    System.out.println(String.format("Names with Stream: %s", namesToPrintFunctional));

  }

  public static void printAllNames(String... names) {
    // ? Imperative
    for (String name : names) {
      System.out.println(name);
    }

    // ? Declarative
    Stream.of(names)
      .forEach(System.out::println);

  }

  public static void printTheDoubleOfEachListValue(Integer... numbers) {
    for (Integer number : numbers) {
      System.out.println(number * 2);
    }

    Stream.of(numbers)
      .map(number -> number * 2)
      .forEach(System.out::println);
  }
}
