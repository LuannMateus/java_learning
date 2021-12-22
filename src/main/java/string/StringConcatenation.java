package string;

public class StringConcatenation {
  public static void main(String[] args) {
    /**
     * Concatenação simples.
     */
    String name = "John Doe";
    String lastName = "William";
    String concatString = name + " " + lastName;
    System.out.println(concatString);

    /**
     * Concatenação com o método concat.
     */
    concatString = name.concat(" ").concat(lastName);
    System.out.println(concatString);

    /**
     * Concatenação com o método concat e simples.
     */
    concatString = name.concat(" ") + lastName;
    System.out.println(concatString);
  }
}
