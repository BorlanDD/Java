import java.util.Scanner;

class Crossing {
  public static void main (String[] args) {
    System.out.print("Enter to amount of numbers in the first array: ");
    Scanner sc = new Scanner(System.in);
    int kol1 = sc.nextInt();
    int[] mas1 = new int[kol1];
    for (int i = 0; i < kol1; i++) {
      System.out.printf("A[%d] = ", i);
      mas1[i] = sc.nextInt();
    }
    System.out.print("Enter to amount of numbers in the second array: ");
    int kol2 = sc.nextInt();
    int[] mas2 = new int[kol2];
    for (int i = 0; i < kol2; i++) {
      System.out.printf("B[%d] = ", i);
      mas2[i] = sc.nextInt();
    }
    int[] mas = new int[kol1];
    int chet = 0;
    for (int i = 0; i < kol1; i++) {
      for (int j = 0; j < kol2; j++) {
        if (mas1[i] == mas2[j]) {
          mas[chet] = mas1[i];
          chet++;
          for (int m1 = i + 1; m1 < kol1; m1++) {
            System.out.println(m1);
            if (mas1[i] == mas1[m1]) {
              mas1[m1] = -999;
            }
          }
          break;
        }
      }
    }
    System.out.print("Intersection: ");
    for (int i = 0; i < chet; i++) {
      System.out.printf("%d ", mas[i]);
    }
  }
}
