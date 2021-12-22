package optional;

import java.util.Optional;

public class OptionalStateExample {
  public static void main(String[] args) {
    // ? Não permite valores nulos - .of()
    Optional<String> optionalString = Optional.of("Is present!");

    // ? Caso o valor esteja presente execute uma função, senão, execute outra
    // função - .ifPresentOrElse()
    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Is not present!"));

    // ? Permite valores nulos - .ofNullable()
    Optional<String> optionalNull = Optional.ofNullable(null);
    System.out.println(optionalNull);

    // ? Valor vazio - .empty()
    Optional<String> emptyOptional = Optional.empty();
    System.out.println(emptyOptional);

  }
}
