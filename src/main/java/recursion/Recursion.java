package recursion;

public class Recursion {
  public static void main(String[] args) {
    // ? Simple recursion
    System.out.println(String.format("Factor of 5: %s", factor(2)));
  }

  public static int factor(int value) {
    if (value == 1) {
      return value;
    } else {
      return value * factor(value - 1);
    }
  }
}
