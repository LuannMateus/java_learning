package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
  public static void main(String[] args) {
    Dog[] dogs = {new Dog(), new Dog()};
    Cat[] cats = {new Cat(), new Cat()};

    searchAnimals(dogs);
    searchAnimals(cats);

    List<Dog> dogsList = new ArrayList<>();
    dogsList.add(new Dog());

    List<Cat> catsList = new ArrayList<>();
    catsList.add(new Cat());

    // searchAnimalsList(dogsList);

    // List<Animal> animalList = new ArrayList<>();
    searchAnimalsList(catsList);
  }

  public static void searchAnimals(Animal[] animals) {
    for (Animal animal : animals) {
      animal.search();
    }
  }

 /* public static void searchAnimalsList(List<Animal> animals) {
    for (Animal animal : animals) {
      animal.search();
    }

    animals.add(new Dog());
    animals.add(new Cat());
  }*/

  // Wild Card -> ? extends [Class]
  public static void searchAnimalsList(List<? extends Animal> animals) {
    for (Animal animal : animals) {
      animal.search();
    }
  }

  // Wild Card -> ? super [Class]
  public static void searchDogList(List<? super Dog> dogList) {
    dogList.add(new Dog());
  }

}

abstract class Animal {
  public abstract void search();
}

class Dog extends Animal {

  @Override
  public void search() {
    System.out.println("Searching Dog..");
  }
}

class Cat extends Animal {

  @Override
  public void search() {
    System.out.println("Searching Cat..");
  }
}


