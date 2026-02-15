import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static final int[] DX = {0, 1, 0, -1};
	private static final int[] DY = {1, 0, -1, 0};
	private static int[][] grid;
	private static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());

		grid = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = 0;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (ok(x, y)) {
					ans++;
				}
			}
		}
		System.out.print(ans);
	}

	private static boolean ok(int x, int y) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			int nx = x + DX[i];
			int ny = y + DY[i];
			if (inRange(nx, ny) && grid[nx][ny] == 1) {
				count++;
				if (count == 3) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean inRange(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N;
	}
}
