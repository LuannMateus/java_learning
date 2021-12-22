package loop_structures;

public class ForEach {
  public static void main(String[] args) {
    String[] names = new String[2];

    names[0] = "John Doe";
    names[1] = "Mary Doe";

    for (String name : names) {
      System.out.println(name);
    }
  }
}
