package exception_handler;

public class Throws {
  public static void main(String[] args) {

    Calculator calc = new Calculator();

    /**
     * Utilizando o try/catch para tratar uma exceção que possa ser lançador pelo
     * método divider.
     */
    try {
      calc.divide(2, 0);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}

class Calculator {
  /**
   * Utilizando o throws para para lançar o error para o método chamador.
   */
  public int divide(int n1, int n2) throws ArithmeticException {
    return n1 / n2;
  }
}
