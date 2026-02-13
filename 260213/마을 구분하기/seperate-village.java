import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] grid;
    private static boolean[][] visited;
    private static int count;
    private static int N;
    private static final List<Integer> results = new ArrayList<>();
    private static final int[] DX = {1, -1, 0, 0};
    private static final int[] DY = {0, 0, 1, -1};
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (dfs(i, j)) {
                    results.add(count);
                    count = 0;
                }
            }
        }

        sb.append(results.size()).append("\n");
        Collections.sort(results);
        for (int result : results) {
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }

    private static boolean dfs(int x, int y) {
        if (!canGo(x, y)) {
            return false;
        }

        visited[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];
            if (canGo(nx, ny)) {
                dfs(nx, ny);
            }
        }

        return true;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N;
    }

    private static boolean canGo(int x, int y) {
        return inRange(x, y) && !visited[x][y] && grid[x][y] == 1;
    }
}