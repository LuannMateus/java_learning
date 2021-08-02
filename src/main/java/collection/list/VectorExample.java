package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
  public static void main(String[] args) {
    List<String> sports = new Vector<>();

    // ? Adicionar elementos no vector - ADD
    sports.add("Futebol");
    sports.add("Basquetebol");
    sports.add("Volei");
    sports.add("UFC");

    // ? Alterar vector - SET
    sports.set(0, "Boxe");

    // ? Remover um elemento - REMOVE
    sports.remove(0); // Usando index
    sports.remove("Basquetebol"); // Usando um elemento

    // ? Pegando um elemento - GET
    System.out.println(sports.get(0));

    // ? Usando um FOR EACH para iterar sobre a collection
    for (String sport : sports) {
      System.out.println(sport);
    }
  }
}
