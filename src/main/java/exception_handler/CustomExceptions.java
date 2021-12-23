package exception_handler;

public class CustomExceptions {
  public static void main(String[] args) throws DivideByZeroException {
    try {
      int val = 10 / 0;
    } catch (Exception e) {
      throw new DivideByZeroException();
    }
  }
}

/**
 * Exceção do tipo unchecked.
 */
// class DivideByZeroException extends RuntimeException {
// }

/**
 * Exceção do tipo checked.
 */
class DivideByZeroException extends Exception {
}