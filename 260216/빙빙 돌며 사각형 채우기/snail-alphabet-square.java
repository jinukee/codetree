import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static char[][] grid;
    private static int N, M;
    private static final int[] DX = {0, 1, 0, -1};
    private static final int[] DY = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new char[N][M];

        grid[0][0] = 'A';
        int x = 0;
        int y = 0;
        int dir = 0;
        for (int i = 1; i < N * M; i++) {
            int nx = x + DX[dir];
            int ny = y + DY[dir];
            if (!canGo(nx, ny)) {
                dir = (dir + 1) % 4;
            }
            x = x + DX[dir];
            y = y + DY[dir];
            grid[x][y] = (char) (65 + i % 26);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static boolean canGo(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M && grid[x][y] == 0;
    }
}
