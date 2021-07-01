package collections.list;

import collections.list.classesForTest.Phone;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObjectExample {
  public static void main(String[] args) {
    final Phone phone1 = new Phone("Iphone", "12345");
    final Phone phone2 = new Phone("Iphone S", "3456");

    List<Phone> phoneList = new ArrayList<>();

    phoneList.add(phone1);
    phoneList.add(phone2);

    for (Phone phone : phoneList) {
      System.out.println(phone);
    }

    System.out.println(phone1.equals(phone2));

  }
}
