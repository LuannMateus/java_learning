package Inference;

import java.util.function.Function;

public class InferenceInLambdaExample {
  public static void main(String[] args) {
    Function<Integer, Double> divisionByTwo = (var number) -> number / 2.0;

    System.out.println("divisionByTwo.apply(4) = " + divisionByTwo.apply(4));
  }
}
