import java.util.Scanner;

class Removing {
  public static void main(String[] args) {
    System.out.print("Enter to amount of numbers in the array: ");
    Scanner sc = new Scanner(System.in);
    int kol = sc.nextInt();
    int[] mas = new int[kol];
    for (int i = 0; i < kol; i++) {
      System.out.printf("A[%d] = ", i);
      mas[i] = sc.nextInt();
    }
    int j = 0;
    int kol_elem = kol;
    int[] new_mas = new int[kol_elem];
    while (kol_elem > 0) {
      int index;
      do {
        System.out.print("Enter the element for delete: ");
        index = sc.nextInt();
      }
      while (index >= kol_elem || index < 0);
      for (int i = 0; i < kol_elem; i++) {
        if (i != index) {
          new_mas[j] = mas[i];
          j++;
        }
      }
      kol_elem = j;
      j = 0;
      if (kol_elem > 0)
        System.out.printf("DONE! Your array: \n");
      else
        System.out.printf("DONE! You have removed all the elements!");
      for (int i = 0; i < kol_elem; i++) {
        System.out.printf("A[%d] = %d\n", i, new_mas[i]);
      }
      mas = new_mas;
    }
  }
}
