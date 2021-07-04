package recursion;

public class TailCallExample {
  public static void main(String[] args) {
    System.out.println(factorA(5));
  }

  public static double factorA(double value) {
    return factorWithTailCall(value, 1);
  }

  public static double factorWithTailCall(double value, double number) {
    if (value == 0) return number;

    return factorWithTailCall(value - 1, number * value);

  }
}
