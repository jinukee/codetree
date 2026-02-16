import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] grid;
    private static int N;
    private static final int[] DX = {0, -1, 0, 1};
    private static final int[] DY = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        grid = new int[N][N];

        int dir = 0;
        int count = 0;
        int dist = 1;

        int x = N / 2;
        int y = N / 2;
        grid[x][y] = 1;

        int now = 2;
        while (now <= N * N) {
            for (int i = 0; i < dist; i++) {
                x += DX[dir];
                y += DY[dir];
                grid[x][y] = now++;
                if (now > N * N) {
                    break;
                }
            }
            dir = (dir + 1) % 4;
            if (++count == 2) {
                count = 0;
                dist++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
