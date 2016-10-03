import java.util.Scanner;

class First {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] mas = new int[n];
    for (int i = 0; i < n; i++) {
      mas[i] = sc.nextInt();
    }
    System.out.printf("Max = %d", min(mas));
    System.out.printf("Min = %d", max(mas));
    System.out.printf("Sum = %d", sum(mas));
  }
  public static int min (int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
      }
    }
    return min;
  }

  public static  int max (int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    return max;
  }

  public static int sum (int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}
