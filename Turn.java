import java.util.Scanner;

class Turn {
  public static void main (String[] args) {
    System.out.print("Enter the amount of rows (columns): ");
    Scanner sc = new Scanner(System.in);
    int rowcol = sc.nextInt();
    int[][] mas = new int[rowcol][rowcol];
    for (int i = 0; i < rowcol; i++) {
      for (int j = 0; j < rowcol; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your array: ");
    for (int i = 0; i < rowcol; i++) {
      for (int j = 0; j < rowcol; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
    int step = 1;
    for (int i = 0; i < rowcol - 1; i++) {
      for (int j = rowcol - i - 2; j >= 0; j--) {
        mas[i][j] = mas[i][j] - mas[i + step][j + step];
        mas[i + step][j + step] = mas[i + step][j + step] + mas[i][j];
        mas[i][j] = mas[i + step][j + step] - mas[i][j];
        step++;
      }
      step = 1;
    }
    System.out.println("\nResult: ");
    for (int i = 0; i < rowcol; i++) {
      for (int j = 0; j < rowcol; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
