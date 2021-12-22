package collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student("John", 31));
    students.add(new Student("Ellie", 18));
    students.add(new Student("Marie", 87));

    System.out.println(students);

    // ? Usando o sort das listas para ordenar os elementos
    students.sort((first, second) -> first.getAge() - second.getAge());
    System.out.println(students);

    students.sort((first, second) -> second.getAge() - first.getAge());
    System.out.println(students);

    // ? Usando a classe Comparator para ordenar os elementos
    students.sort(Comparator.comparingInt(Student::getAge));
    System.out.println(students);

    students.sort(Comparator.comparingInt(Student::getAge).reversed());
    System.out.println(students);

    // ? Usando a classe Collection para ordenar os elementos
    Collections.sort(students);
    System.out.println(students);

    Collections.sort(students, new ReverseStudent());
    System.out.println(students);

  }
}
