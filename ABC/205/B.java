import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = 1;
    int[] a = new int[n];
    int[] a2 = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int j = 0; j < n; j++) {
      a2[j] = k + j;
    }
    Arrays.sort(a);
    System.out.print(Arrays.equals(a, a2) == true ? "Yes" : "No");
  }
}