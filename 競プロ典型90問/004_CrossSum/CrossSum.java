import java.util.Scanner;

public class CrossSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] ary = new int[h][w];
        int[] row = new int[h];
        int[] column = new int[w];
        int[][] ans = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
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