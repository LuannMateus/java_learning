package Inference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenceExample {
  public static void main(String[] args) throws IOException {
    connectAndPrintURLJavaOracle();
    printTheFullName("John", "Doe");
    printSum(1, 2, 3);
  }

  private static void connectAndPrintURLJavaOracle() {
    try {
      var url = new URL("https://docs.oracle.com/javase/10/language/");

      var urlConnection = url.openConnection();

      try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
      }

    } catch (Exception error) {
      error.printStackTrace();
    }
  }

  public static void printTheFullName(String name, String lastName) {
    var fullName = String.format("%s %s", name, lastName);

    System.out.println(fullName);
  }

  public static void printSum(int... numbers) {
    int sum;

    if (numbers.length > 0) {
      sum = 0;

      for (var num : numbers) {
        sum += num;
      }

      System.out.println(sum);
    }
  }


  //Consegue

  // variaveis local inicializadas
  // variavel suporte do enhaced for
  // variavel suporte do for iterativo
  // variavel try with resource

  //Nao consegue

  // var nao pode ser utilizado em nivel de classe
  // var nao pode ser utilizado como parametro
  // var nao pode ser utilizada em variaveis locais nao inicializadas


  // https://docs.oracle.com/javase/10/language/
}
