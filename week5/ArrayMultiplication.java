import java.util.Arrays;

public class ArrayMultiplication {
  public static void main(String[] args) {
    int[][] m1 = {
        { 5, 10, 7, 19 },
        { 1, 67, -3, 45 },
        { 3, 0, 7, 1 } };
    int[][] m2 = {
        { 1, 8, 5, 81, -67 },
        { 2, 99, -6, 102, 0 },
        { 53, -3, 3, 1, 3 },
        { 71, 0, 84, 3, -78 } };

    int[][] multiplied = new int[m1.length][m2[0].length];

    for (int i = 0; i < multiplied.length; i++) {
      for (int j = 0; j < multiplied[i].length; j++) {
        multiplied[i][j] = 0;

        for (int k = 0; k < m1[0].length; k++) {
          multiplied[i][j] += m1[i][k] * m2[k][j];
        }
      }
    }

    for (int[] row : multiplied) {
      System.out.println(Arrays.toString(row));
    }
  }
}
