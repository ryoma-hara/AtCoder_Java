import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    int k = 0;
    int[] a = new int[n];
    a[0] = n;

    while (i < n) {
      a[k++] = sc.nextInt();
      i++;
    }
    for (int j = 0; j < n-1; j++) {
      if (a[j] < a[j+1]) {
        System.out.println("up" + " " +(a[j+1]-a[j]));
      } else if (a[j+1] < a[j]) {
        System.out.println("down" + " " +(a[j]-a[j+1]));
      } else {
        System.out.println("stay");
      }
    }
    sc.close();
  }
}
