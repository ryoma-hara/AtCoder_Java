import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double a2 = (double)a;
    double b2 = (double)b;
    
    System.out.print(b2/100.0*a2);
  }
}