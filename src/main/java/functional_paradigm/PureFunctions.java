package functional_paradigm;

import java.util.function.BiPredicate;

public class PureFunctions {
  public static void main(String[] args) {
    BiPredicate<Integer, Integer> verifyIfIsHigher = (parameter, comparisonValue) -> parameter > comparisonValue;

    System.out.println(verifyIfIsHigher.test(13, 12));
    System.out.println(verifyIfIsHigher.test(13, 12));
  }
}
