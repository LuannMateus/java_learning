package functional_paradigm;

import java.util.function.UnaryOperator;

public class Immutability {
  public static void main(String[] args) {

    int value = 20;

    UnaryOperator<Integer> doubleReturn = v -> v * 2;

    System.out.println(doubleReturn.apply(value));
    System.out.println(value); // ? The value will not be altered
  }
}
