import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    if (a == b) {
      if (c == 0) {
        System.out.print("Aoki");
      } else {
        System.out.print("Takahashi");
      }
    } else {
      System.out.print(a < b ? "Aoki":"Takahashi");
    }
  }
}