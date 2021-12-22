package string;

public class StringEscapes {
  public static void main(String[] args) {
    // * \n - Pular uma linha.
    String name = "FIAP \nA melhor faculdade de tecnologia";
    System.out.println(name);

    // * \t - Tabulação horizontal.
    name = "FIAP \tA melhor faculdade de tecnologia";
    System.out.println(name);

    /*
     * \\ - Barras invertidas. Utilizada para gerar um caractere de barra invertida
     * (\).
     */
    name = "FIAP \\A melhor faculdade de tecnologia";
    System.out.println(name);

    // * \" - Aspas duplas. Utilizada para gerar um caractere de aspas duplas.
    name = "FIAP \"A melhor faculdade de tecnologia\"";
    System.out.println(name);

    // * \' - Aspas simples. Utilizada para gerar um caractere de aspas simples.
    name = "FIAP \'A melhor faculdade de tecnologia\'";
    System.out.println(name);

  }
}
