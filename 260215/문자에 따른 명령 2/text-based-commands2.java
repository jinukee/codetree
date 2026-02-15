import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static final int[] DX = {0, 1, 0, -1};
	private static final int[] DY = {1, 0, -1, 0};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String command = br.readLine();

		int dir = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < command.length(); i++) {
			char c = command.charAt(i);

			if (c == 'L') {
				dir = (dir + 3) % 4;
			} else if (c == 'R') {
				dir = (dir + 1) % 4;
			} else {
				x += DX[dir];
				y += DY[dir];
			}
		}

		System.out.print(x + " " + y);
	}
}
