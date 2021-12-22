package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
  public static void main(String[] args) {

    /*
     * ? Collection HashSet
     * A ordem nao importa
     * Nao aceita elementos repetidos
     */
    HashSet<Double> studentGrade = new HashSet<>();

    // ? Adicionando elementos ao SET - ADD
    studentGrade.add(1.2);
    studentGrade.add(3.2);
    studentGrade.add(6.5);

    // ? Removendo um elemento - REMOVE
    studentGrade.remove(3.8);

    // ? Retornando o tamanho do SET - SIZE
    System.out.println(studentGrade.size());

    // ? Usando um FOR EACH em um SET
    for (Double grade : studentGrade) {
      System.out.println(grade);
    }

    // ? Usando um ITERATOR em um SET
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
