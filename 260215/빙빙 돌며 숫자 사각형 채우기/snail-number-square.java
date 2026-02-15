import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int[][] grid;
	private static int N, M;

	private static final int[] DX = {0, 1, 0, -1};
	private static final int[] DY = {1, 0, -1, 0};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		grid = new int[N][M];
		int dir = 0;

		int x = 0, y = 0;
		int count = 1;
		grid[x][y] = count;
		for (int i = 1; i < N * M; i++) {
			if (!canGo(x + DX[dir], y + DY[dir])) {
				dir = (dir + 1) % 4;
			}
			x += DX[dir];
			y += DY[dir];
			grid[x][y] = ++count;
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
