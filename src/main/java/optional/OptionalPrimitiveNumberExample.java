package optional;

import java.util.Optional;

public class OptionalPrimitiveNumberExample {
  public static void main(String[] args) {
    // ? Valor inteiro INTEGER
    Optional.of(12).ifPresent(System.out::println);

    // ? Valor decimal DOUBLE
    Optional.of(55.0).ifPresent(System.out::println);

    // ? Valor decimal LONG
    Optional.of(24L).ifPresent(System.out::println);
  }
}
