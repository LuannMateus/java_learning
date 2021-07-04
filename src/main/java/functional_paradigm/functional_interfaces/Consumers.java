package functional_paradigm.functional_interfaces;

import java.util.function.Consumer;

public class Consumers {
  public static void main(String[] args) {
    // ? Consumer será usado para métodos com retorno void

    // Example with lambda
    // Consumer<String> printAPhrase = phrase -> System.out.println(phrase);

    // ? Method Reference
    // * O parâmetro se torna implicito e já passado para o método.

    Consumer<String> printAPhrase = System.out::println;
    printAPhrase.accept("Hello World!");

  }
}
