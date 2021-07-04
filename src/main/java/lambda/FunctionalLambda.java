package lambda;

public class FunctionalLambda {
  public static void main(String[] args) {
    // ? A simple lambda
    FuncLambda myName = value -> value + " :)";

    System.out.println(myName.generate("Luan"));

    // ? Lambda with more than one parameter and instruction
    FuncMoreThanOneParameterAndInstruction myFullName = (name, lastName) -> {
      final String fullName = String.format("%s %s xD", name, lastName);

      return fullName;
    };

    System.out.println(myFullName.generate("Luan", "Mateus"));

  }
}

@FunctionalInterface
interface FuncLambda {
  String generate(String value);
}

@FunctionalInterface
interface FuncMoreThanOneParameterAndInstruction {
  String generate(String valueOne, String valueTwo);
}
