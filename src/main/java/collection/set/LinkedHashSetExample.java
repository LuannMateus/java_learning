package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
  public static void main(String[] args) {
    /*
     * ? Collection HashSet
     * A ordem importa
     * Nao aceita elementos repetidos
     * Mais lenta em comparacao com o HashSet
     */
    LinkedHashSet<Double> studentGrade = new LinkedHashSet<>();

    // ? Adicionando elementos ao LinkedHashSet - ADD
    studentGrade.add(1.2);
    studentGrade.add(3.2);
    studentGrade.add(6.5);

    // ? Removendo um elemento - REMOVE
    studentGrade.remove(3.8);

    // ? Retornando o tamanho do LinkedHashSet - SIZE
    System.out.println(studentGrade.size());

    // ? Usando um FOR EACH em um LinkedHashSet
    for (Double grade : studentGrade) {
      System.out.println(grade);
    }

    // ? Usando um ITERATOR em um LinkedHashSet
    Iterator<Double> iterator = studentGrade.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // ? Verificando se o SET esta vazio
    System.out.println(studentGrade.isEmpty());

    // ? Removendo todos os elementos - CLEAR
    studentGrade.clear();
  }
}
