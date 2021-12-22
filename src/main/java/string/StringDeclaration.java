package string;

public class StringDeclaration {
  public static void main(String[] args) {
    // * Declaração de uma String.
    String name;

    /*
     * Declaração e atribuição de uma string.
     * Essa forma reserva um espaço na memória para alocar a string.
     */
    String name2 = new String();
    name2 = "FIAP";

    /*
     * Declaração e atribuição de um valor.
     * Essa forma reserva um espaço na memória para alocar a string.
     */
    String name3 = new String("FIAP");

    /*
     * Declaração e atribuição direta.
     * Essa forma não é reservado um espaço na memória e sim, utilizado um pool de
     * strings, uma área utilizado pelo java como cache.
     */
    String name4 = "FIAP";
  }
}
