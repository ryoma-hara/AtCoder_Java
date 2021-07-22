import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[][] ary = new int[h][w];
        int[] row = new int[h];
        int[] column = new int[w];
        int[][] ans = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ary[i][j] = Integer.parseInt(sc.next());
                row[i] += ary[i][j];
                column[j] += ary[i][j];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = row[i] + column[j] - ary[i][j];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}