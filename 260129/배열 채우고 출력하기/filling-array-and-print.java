import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String[] inputs = new String[10];
		for (int i = 0; i < 10; i++) {
			inputs[i] = st.nextToken();
		}
		for (int i = 9; i >= 0; i--) {
			sb.append(inputs[i]);
		}

		System.out.println(sb);
		br.close();
	}
}
