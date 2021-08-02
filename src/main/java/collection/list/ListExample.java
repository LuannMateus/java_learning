package collection.list;

import java.util.*;

public class ListExample {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Ellie");
    names.add("William");
    names.add("Saul");
    names.add("John");

    // ? Alterando um elemento - SET
    names.set(3, "Doe");

    // ? Ordenando elementos - SORT
    Collections.sort(names);

    // ? Removendo elemento - REMOVE
    names.remove(3); // Usando index
    names.remove("Doe"); // Usando um elemento

    // ? Pegando um elemento - GET
    String name = names.get(0);

    // ? Pegando a posicao de um elemento - INDEXOF
    System.out.println(names.indexOf("Ellie"));

    // ? Pegando o tamanho da collection - SIZE
    System.out.println(names.size());

    // ? Verificando se a collection possui algum elemento - CONTAINS
    System.out.println(names.contains("Ellie"));

    // ? Verificando se a collection esta vazia - ISEMPTY
    System.out.println(names.isEmpty());

    // ? Usando um FOR EACH para iterar sobre uma collection
    for (String element : names) {
      System.out.println(element);
    }

    // ? Usando um ITERATOR em uma collection
    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // ? Removando todos os elementos de uma collection - CLEAR
    names.clear();

    System.out.println(name);

  }
}
