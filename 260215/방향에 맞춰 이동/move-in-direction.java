import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static final int[] DX = {1, -1, 0, 0};
	private static final int[] DY = {0, 0, 1, -1};
	private static final Map<String, Integer> DIRECTION = new HashMap<>();

	static {
		DIRECTION.put("N", 2);
		DIRECTION.put("S", 3);
		DIRECTION.put("E", 0);
		DIRECTION.put("W", 1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String dirRaw = st.nextToken();
			int dir = DIRECTION.get(dirRaw);
			int count = Integer.parseInt(st.nextToken());

			for (int c = 0; c < count; c++) {
				x += DX[dir];
				y += DY[dir];
			}
		}

		System.out.print(x + " " + y);
	}
}
