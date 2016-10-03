import java.util.Scanner;

class GlobalMaxMinAndLocalMaxMin {
  public static void main (String[] args) {
    System.out.print("Enter the amount of numbers in the array: ");
    Scanner sc = new Scanner(System.in);
    int kol = sc.nextInt();
    int[] mas = new int[kol];
    System.out.println("Enter the elements of the array: ");
    int min = 0, max = 0;
    for (int i = 0; i < kol; i++) {
      System.out.printf("A[%d] = ", i);
      mas[i] = sc.nextInt();
      if (i == 0) {
        min = mas[i];
        max = mas[i];
      } else {
        if (mas[i] > max) {
          max = mas[i];
        }
        if (mas[i] < min) {
          min = mas[i];
        }
      }
    }
    System.out.print("Local maximum elements:");
    for (int i = 1; i < kol - 1; i++) {
      if ((mas[i] > mas[i - 1]) && (mas[i] > mas[i + 1])) {
        System.out.printf(" %d ", mas[i]);
      }
    }
    System.out.print("\nLocal minimum elements:");
    for (int i = 1; i < kol - 1; i++) {
      if ((mas[i] < mas[i - 1]) && (mas[i] < mas[i + 1])) {
        System.out.printf(" %d ", mas[i]);
      }
    }
    System.out.printf("\nThe maximum element: %d\n", max);
    System.out.printf("The minimal element: %d\n", min);
  }
}
