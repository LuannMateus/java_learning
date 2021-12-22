package string;

public class StringMethods {
  public static void main(String[] args) {
    /**
     * Equals(string): verifica a igualdade do valor das strings.
     */
    String nome = "FIAP";
    String nome2 = new String("FIAP");
    if (nome.equals(nome2)) {
      System.out.println("As Strings são iguais");
    } else {
      System.out.println("As Strings são diferentes");
    }

    /**
     * EqualsIgnoreCase(string): verifica a igualdade do valor das strings sem
     * diferenciar as letras maiúsculas e minúsculas.
     */
    nome = "fiap";
    nome2 = new String("FIAP");
    if (nome.equalsIgnoreCase(nome2)) {
      System.out.println("As Strings são iguais");
    } else {
      System.out.println("As Strings são diferentes ");
    }

    /**
     * startsWith(string): Verificar se uma string começa com uma sequência de
     * caracteres específica.
     */
    String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    if (facu.startsWith("FIAP")) {
      System.out.println("A string começa com FIAP");
    } else {
      System.out.println("A string não começa com FIAP");
    }

    /**
     * endsWith(string): verificar se uma string termina com uma sequência de
     * caracteres específica.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    if (facu.endsWith("gia")) {
      System.out.println("A string termina com gia");
    } else {
      System.out.println("A string não termina com gia");
    }

    /**
     * length(): Recupera a quantidade de caracteres de uma string.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    int caracteres = facu.length();
    System.out.println("A string possui " + caracteres + " caracteres");

    /**
     * chartAt(int): Obtêm um caractere da string a partir do index.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    char caracter = facu.charAt(1);
    System.out.println("O segundo carácter da string é " + caracter);

    /**
     * indexOf(string): Localiza a primeira ocorrência de um caractere ou palavra em
     * uma string.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    int posicao = facu.indexOf('a');
    System.out.println("O índice do caracter 'a' na string é " + posicao);

    /**
     * lastIndexOf(int): Retorna o índice da última ocorrência de um caractere ou
     * palavra em uma string.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    posicao = facu.lastIndexOf('a');
    System.out.println("O índice do último caracter 'a' na string é " + posicao);

    /**
     * subString(begin, end) ou subString(beginToEnd): É possível criar uma string a
     * partir
     * de um trecho de
     * outra
     * string utilizando o método subString. Este método recebe como parâmetro a
     * posição inicial (inclusive) e a posição final (exclusive) do conjunto de
     * caracteres a serem copiados da string original. O caractere da posição
     * inicial será copiado para a nova string, já o caractere da última posição não
     * será copiado.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova = facu.substring(16, 25);
    System.out.println("A nova string é: " + nova);

    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    nova = facu.substring(16);
    System.out.println("A nova string é: " + nova);

    /**
     * toUpperCase(): Transforma todos os caracteres em maiúsculo.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    nova = facu.toUpperCase();
    System.out.println("A nova string é: " + nova);

    /**
     * toLowerCase(): Transforma todos os caracteres em maiúsculo.
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    nova = facu.toLowerCase();
    System.out.println("A nova string é: " + nova);

    /**
     * replace(stringToReplace, replaced): Podemos substituir caracteres ou palavras
     * de uma string original. O método replace recebe como parâmetros o caractere
     * ou palavra a ser substituída e a letra ou palavra para substituir. Esse
     * método também cria uma nova string com a alteração:
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    nova = facu.replace('a', 'x');
    System.out.println("A nova string é: " + nova);

    /**
     * split(string): O último método da classe string que será
     * estudado será o método split. Este é um método muito útil, que separa o valor
     * de uma string em várias strings separadas por um delimitador, que deve ser
     * informado ao método:
     */
    facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String[] palavras = facu.split(" ");
    for (String p : palavras) {
      System.out.println(p);
    }

  }
}
