package optional;

import java.util.Optional;

public class OptionalExample {
  public static void main(String[] args) {
    Optional<String> optionalString = Optional.of("Optional Value");

    // ? Retorna true caso exista algum dado - .isPresent()
    System.out.println(optionalString.isPresent());

    //  ? Retorna true caso não exista algum dado - .isEmpty()
    System.out.println(optionalString.isEmpty());

    // ? Caso o valor esteja presente execute uma função, senão, execute outra função - .ifPresentOrElse()
    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Is not present!"));

    // ? Retorna o valor do optional - .get()
    if (optionalString.isPresent()) {
      String value = optionalString.get();

      System.out.println(value);
    }

    // ? Usando iterator MAP com optional - .map()
    optionalString.map((word) -> word.concat("***")).ifPresent(System.out::println);

    // ? Caso não exista valor, jogue um erro - .orElseThrow()
    optionalString.orElseThrow(IllegalStateException::new);

  }
}
