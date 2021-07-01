package lambda;

import java.util.function.UnaryOperator;

public class LambdaExample {
  public static void main(String[] args) {

    // ? Lambda function
    UnaryOperator<Integer> valueCalcMultiThird = value -> value * 100;

    System.out.println(String.format("The result is %s ", valueCalcMultiThird.apply(10)));
  }
}
