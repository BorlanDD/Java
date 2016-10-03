import java.util.Scanner;

class InversedOutput {
  public static void main (String[] args) {
    System.out.print("\nEnter the amount of numbers in the array: ");
    Scanner scanner = new Scanner(System.in);
    byte kol = scanner.nextByte();
    int[] mas = new int[kol];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < kol; i++) {
      mas[i] = scanner.nextInt();
    }
    System.out.println("Inverted array: ");
    for (int i = kol - 1; i >= 0; i--) {
      System.out.printf("A[%d] = %d\n", i, mas[i]);
    }
    int[] mas2 = new int[kol];
    System.out.println("Inverted array in the memory: ");
    for (int i = 0; i < kol; i++) {
      mas2[i] = mas[kol - i - 1];
      System.out.printf("A[%d] = %d\n", i, mas2[i]);
    }
  }
}
