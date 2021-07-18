import java.util.Scanner;

public class A {
  static int a;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      a = sc.nextInt();
      System.out.print(a * 2);
    } catch (Exception e) {
      System.out.println("error");
    }
    sc.close();
  }
}