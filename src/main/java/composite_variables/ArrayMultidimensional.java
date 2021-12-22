package composite_variables;

public class ArrayMultidimensional {
  public static void main(String[] args) {
    /*
     * Array de duas dimensões
     */

    int[][] grade = new int[2][2];

    grade[0][0] = 10;
    grade[1][0] = 9;

    /*
     * Array de três dimensões
     */
    int[][][] arrayWithThreeDimensions = new int[2][2][2];

    arrayWithThreeDimensions[0][0][0] = 1;
  }
}
