import java.util.Scanner;

class Bubble {
  public static void main (String[] args) {
    System.out.print("Enter to amount of numbers in the array: ");
    Scanner sc = new Scanner(System.in);
    int kol = sc.nextInt();
    int[] mas = new int[kol];
    for (int i = 0; i < kol; i++) {
      System.out.printf("A[%d] = ", i);
      mas[i] = sc.nextInt();
    }
    for (int i = 0; i < kol - 1; i++) {
      for (int j = i + 1; j < kol; j++) {
        if (mas[i] > mas[j]) {
          int buf = mas[j];
          mas[j] = mas[i];
          mas[i] = buf;
        }
      }
    }
    System.out.printf("\nSort array down: ");
    for (int i = 0; i < kol; i++) {
      System.out.print(mas[i] + " ");
    }
    System.out.printf("\nSort array up: ");
    for (int i = kol - 1; i >= 0; i--) {
      System.out.print(mas[i] + " ");
    }
  }
}
