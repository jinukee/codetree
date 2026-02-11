import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int result = 0;
        for(int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                result = Math.max(result, count(i, j, grid));
            }
        }

        System.out.println(result);
    }

    private static int count(int x, int y, int[][] grid) {
        int count = 0;
        for(int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }
}