package functional_paradigm.functional_interfaces;

import java.util.function.Predicate;

public class Predicates {
  public static void main(String[] args) {
    // ? Predicate Interface
    // * Usado em métodos que retornam um booleano

    Predicate<String> isEmptyOrNot = String::isEmpty;

    System.out.println(isEmptyOrNot.test(""));
    System.out.println(isEmptyOrNot.test("IS NOT EMPTY"));
  }
}
