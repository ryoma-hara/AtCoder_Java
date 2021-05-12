import java.util.Scanner;

public class ABC049C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    str = str.replace("eraser", "");
    str = str.replace("erase", "");
    str = str.replace("dreamer", "");
    str = str.replace("dream", "");

    if (str.equals("")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}