import java.util.Scanner;

class DiagonalsAndFindMin {
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
    System.out.printf("Your matrix: \n");
    for (int i = 0; i < rowcol; i++) {
      for (int j = 0; j < rowcol; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
    int rc = 0;
    int sumM = 0;
    int sumP = 0;
    while (rc < rowcol) {
      sumM += mas[rc][rc];
      sumP += mas[rowcol - rc - 1][rc];
      rc++;
    }
    int min = mas[0][rowcol - 1];
    for (int i = 0; i < rowcol - 1; i++) {
      for (int j = i + 1; j < rowcol; j++) {
        if (mas[i][j] < min) {
          min = mas[i][j];
        }
      }
    }
    System.out.printf("\nSum of the main diagonal: %d\n", sumM);
    System.out.printf("Sum of the secondary diagonal: %d\n", sumP);
    System.out.printf("Minimal element among the elements above the main diagonal: %d\n", min);
  }
}
