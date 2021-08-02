package asynchronous_parallel_process;

import java.util.stream.IntStream;

public class ParallelStreamExample {
  public static void main(String[] args) {
    long START = System.currentTimeMillis();
    IntStream.range(1, 100000)
      .forEach(num -> factorial(num));
    long END = System.currentTimeMillis();

    System.out.println("TOTAL TIME USING SERIAL -> " + (END - START));

    // ? Exemplo usando Parallel para otimizar a performace
    long START_ = System.currentTimeMillis();
    IntStream.range(1, 10000)
      .parallel()
      .forEach(num -> factorial(num));
    long END_ = System.currentTimeMillis();

    System.out.println("TOTAL TIME USING SERIAL -> " + (END_ - START_));

  }

  public static long factorial(long num) {
    long fat = 1;

    for (long i = 2; i < num; i++) {
      fat *= i;
    }

    return fat;
  }
}
