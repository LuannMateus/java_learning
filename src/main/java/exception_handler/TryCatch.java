package exception_handler;

public class TryCatch {
  public static void main(String[] args) {
    /**
     * Tratamento de erros com try/catch
     */

    try {
      int val = 10 / 0;

      int[] values = new int[3];
      System.out.println(values[3]);

      String name = null;
      System.out.println(name.length());

      int number = Integer.parseInt("Zero");
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
