import java.util.Scanner;

class RowSorting {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount of rows in the array: ");
    int rows = sc.nextInt();
    System.out.print("Enter the amount of columns in the array: ");
    int cols = sc.nextInt();
    int[][] mas = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your array: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols - 1; j++) {
        for (int t = j + 1; t < cols; t++) {
          if (mas[i][j] > mas[i][t]) {
            int buf = mas[i][j];
            mas[i][j] = mas[i][t];
            mas[i][t] = buf;
          }
        }
      }
    }
    System.out.println("Result: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
