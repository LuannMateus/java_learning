package recursion;

import java.util.HashMap;
import java.util.Map;

public class MemorizationRecursionExample {
  static Map<Integer, Integer> FACTORIAL_MAP = new HashMap();

  public static void main(String[] args) {
    long ONE_START = System.nanoTime();
    System.out.println(factorWithMemorization(5));
    long ONE_END = System.nanoTime();

    System.out.println("FACTORIAL 1 | TOTAL TIME = " + (ONE_END - ONE_START));

    long TWO_START = System.nanoTime();
    System.out.println(factorWithMemorization(5));
    long TWO_END = System.nanoTime();

    System.out.println("FACTORIAL 2 | TOTAL TIME = " + (TWO_END - TWO_START));

  }

  public static Integer factorWithMemorization( Integer value ) {
    if (value == 1) {
      return value;
    } else {
        if (FACTORIAL_MAP.containsKey(value)) {
          return FACTORIAL_MAP.get(value);
        } else {
          Integer result = value * factorWithMemorization(value - 1);
          FACTORIAL_MAP.put(value, result);
          return  result;
        }
    }
  }
}
