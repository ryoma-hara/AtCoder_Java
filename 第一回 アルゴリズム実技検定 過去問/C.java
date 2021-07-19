import java.util.Scanner;
import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[6];
        int i = 0;

        while (i < 6) {
            ary[i] = sc.nextInt();
            i++;
        }
        sc.close();
        Arrays.sort(ary);
        System.out.print(ary[3]);
    }
}