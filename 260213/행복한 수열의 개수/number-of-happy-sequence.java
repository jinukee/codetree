import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        // row 조사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (grid[i][j] == grid[i][j - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == M) {
                    result += 1;
                    break;
                }
            }
        }

        // column 조사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (grid[j][i] == grid[j - 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == M) {
                    result += 1;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}