import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    sc.close();
    if (s.indexOf("1") % 2 == 0) {
      System.out.print("Takahashi");
    } else {
      System.out.print("Aoki");
    }
  }
}