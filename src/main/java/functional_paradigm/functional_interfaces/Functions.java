package functional_paradigm.functional_interfaces;

import java.util.function.Function;

public class Functions {
  public static void main(String[] args) {

    // ? Function Interface
    // * Usado em métodos para tipar o parâmetro de entrada e saída.
    Function<String, String> returnReverserName = text -> new StringBuilder(text).reverse().toString();
    Function<String, Integer> convertStringToIntegerAndDoubleCalculate = string -> Integer.valueOf(string) * 2;

    System.out.println(returnReverserName.apply("Luan"));
    System.out.println(convertStringToIntegerAndDoubleCalculate.apply("20"));
  }
}
