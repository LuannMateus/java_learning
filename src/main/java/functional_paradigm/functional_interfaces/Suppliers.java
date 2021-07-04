package functional_paradigm.functional_interfaces;

import java.util.function.Supplier;

public class Suppliers {
  public static void main(String[] args) {
    // ? Supplier Interface
    // * Usado em métodos que retornam algo que foi especificado no generics

    Supplier<Person> suppliers = Person::new;

    System.out.println(suppliers.get());

  }

}

class Person {
  private String name;
  private Integer age;

  public Person() {
    this.name = "Luan";
    this.age = 19;
  }

  @Override
  public String toString() {
    return String.format("Name: %s | age: %d", this.name, this.age);
  }
}
