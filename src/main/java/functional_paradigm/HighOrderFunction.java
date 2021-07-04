package functional_paradigm;

public class HighOrderFunction {
  public static void main(String[] args) {
    Calc sum = (x, y) -> x + y;

    // ? High Order Function
    System.out.println(executeOperation(sum, 1, 1));
  }

  public static int executeOperation(Calc calc, int x, int y) {
    return calc.Calculate(x, y);
  }

}

interface Calc {
  int Calculate(int x, int y);
}
