import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int[] DX = {1, -1, 0, 0};
    private static final int[] DY = {0, 0, 1, -1};
    private static int N, M;
    private static int[][] grid;

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

        bfs(new int[]{0, 0});
        int result = 0;
        if (grid[N - 1][M - 1] == 2) {
            result = 1;
        }
        System.out.println(result);
    }

    private static void bfs(int[] start) {
        grid[start[0]][start[1]]++;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + DX[i];
                int ny = now[1] + DY[i];
                if (canGo(nx, ny)) {
                    grid[nx][ny]++;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    private static boolean canGo(int x, int y) {
        return inRange(x, y) && grid[x][y] == 1;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }
}