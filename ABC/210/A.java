import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    if ((n-a) <= 0) {
      System.out.print(n*x);
    } else {
      System.out.print(a*x + (n-a)*y);
    }
  }
}