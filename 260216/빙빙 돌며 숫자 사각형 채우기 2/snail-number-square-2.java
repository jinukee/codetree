import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] grid;
    private static int N, M;
    private static final int[] DX = {1, 0, -1, 0};
    private static final int[] DY = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][M];

        grid[0][0] = 1;
        int x = 0;
        int y = 0;
        int dir = 0;
        for (int i = 2; i <= N * M; i++) {
            int nx = x + DX[dir];
            int ny = y + DY[dir];
            if (!canGo(nx, ny)) {
                dir = (dir + 1) % 4;
            }
            x = x + DX[dir];
            y = y + DY[dir];
            grid[x][y] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static boolean canGo(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M && grid[x][y] == 0;
    }
}
