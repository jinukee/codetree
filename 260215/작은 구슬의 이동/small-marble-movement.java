import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static final int[] DX = {1, 0, 0, -1};
	private static final int[] DY = {0, 1, -1, 0};
	private static int N;

	private static final Map<String, Integer> DIRECTION = new HashMap<>();

	static {
		DIRECTION.put("U", 3);
		DIRECTION.put("D", 0);
		DIRECTION.put("R", 1);
		DIRECTION.put("L", 2);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		int dir = DIRECTION.get(st.nextToken());

		while (T-- > 0) {
			int nx = x + DX[dir];
			int ny = y + DY[dir];

			if (!inRange(nx, ny)) {
				dir = 3 - dir;
				continue;
			}
			x = nx;
			y = ny;
		}

		System.out.print((x + 1) + " " + (y + 1));
	}

	private static boolean inRange(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N;
	}
}
