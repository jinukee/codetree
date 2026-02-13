import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[][] grid;
    private static int N;
    private static int M;
    private static final int[] DX = {1, 0};
    private static final int[] DY = {0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        grid[0][0] = 2;
        dfs(0, 0);
        int result = 0;
        if (grid[N - 1][M - 1] == 2) {
            result = 1;
        }
        System.out.println(result);
    }

    private static void dfs(int x, int y) {
        for (int i = 0; i < 2; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];
            if (canGo(nx, ny)) {
                grid[nx][ny]++;
                dfs(nx, ny);
            }
        }
    }

    private static boolean canGo(int x, int y) {
        return inRange(x, y) && grid[x][y] == 1;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}