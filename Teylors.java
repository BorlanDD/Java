import java.util.Scanner;

class Teylors {
  public static void main (String[] args) {
    while (true) {
      System.out.println("For finding the sinus, press '1' \nTo find the definite integral, press '2'");
      Scanner sc = new Scanner(System.in);
      System.out.print("Your answer: ");
      if (sc.nextByte() == 1) {
        selectSin();
      } else {
        selectIntegral();
      }
      System.out.print("To repeat the enter '1': ");
      if (sc.nextInt() != 1) {
        break;
      }
    }
  }
  // Если выбрали нахождение синуса
  public static void selectSin () {
    System.out.print("sin(x) = ");
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    System.out.print("eps = ");
    double eps = sc.nextDouble();
    TeylorSin ts = new TeylorSin();
    System.out.printf("Result: %f\n", ts.sinTeylor(x, eps));
  }
  // Если выбрали нахождение определенного интеграла
  public static void selectIntegral () {
    System.out.print("a = ");
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    System.out.print("b = ");
    double b = sc.nextDouble();
    System.out.print("size = ");
    int kolvo = sc.nextInt();
    TeylorIntegral ti = new TeylorIntegral();
    System.out.printf("Result: %f\n", ti.cals(ti.generateX(a, b, kolvo)));
  }
}
// Нахождние синуса
class TeylorSin {
  public static double sinTeylor (double x, double eps) {
    double sum = x;
    double buf = x;
    double n = 1;
    double p = 0;
    do {
      p = -((x * x) / (4 * n * n + 2 * n));
      buf *= p;
      sum += buf;
      n++;
    }
    while (Math.abs(buf - (buf / p)) > eps);
    return sum;
  }
}
// Нахождение определенного интеграла
class TeylorIntegral {
  public static double[] generateX (double a, double b, int kolvo) {
    double[] mas = new double[kolvo];
    mas[0] = a;
    mas[kolvo - 1] = b;
    double step = (b - a) / (kolvo - 1);
    for (int i = 1; i < kolvo - 1; i++) {
      mas[i] = mas[i - 1] + step;
    }
    return mas;
  }
  public static double cals (double[] x) {
    double sum = 0;
    for (int i = 0; i < x.length - 1; i++) {
      sum += func(x[i]) * (x[i + 1] - x[i]);
    }
    return sum;
  }
  public static double func (double x) {
    return Math.cos(x);
  }
}
