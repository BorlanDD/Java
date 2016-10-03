import java.util.Scanner;

class FunctionBubble {
  static int rows, cols;
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount of rows in the array: ");
    rows = sc.nextInt();
    System.out.print("Enter the amount of columns in the array: ");
    cols = sc.nextInt();
    int[][] mas = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas[i][j] = sc.nextInt();
      }
    }
    result(mas);
  }
  public static void result (int[][] a) {
    System.out.println("Your array: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols - 1; j++) {
        for (int t = j + 1; t < cols; t++) {
          if (a[i][j] > a[i][t]) {
            int buf = a[i][j];
            a[i][j] = a[i][t];
            a[i][t] = buf;
          }
        }
      }
    }
    System.out.println("Result: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
