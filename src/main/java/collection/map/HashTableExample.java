package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
  public static void main(String[] args) {
    Hashtable<String, Integer> students = new Hashtable<>();

    // ? Adicionando elementos - PUT
    students.put("John", 10);
    students.put("Marie", 8);
    students.put("Ellie", 10);

    // ? Removendo um elemento - REMOVE
    students.remove("John");

    // ? Retornando um elemento - GET
    System.out.println(students.get("Ellie"));

    // ? Retornando o tamanho da HashTable - SIZE
    System.out.println(students.size());

    // ? Usando um FOR EACH na HashTable
    for (Map.Entry<String, Integer> element : students.entrySet()) {
      System.out.println(element.getKey() + " -- " + element.getValue());
    }

    for (String key : students.keySet()) {
      System.out.println(key + " -- " + students.get(key));
    }
  }

}
