import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static int ans = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        backtrack(0);
        System.out.println(ans);
    }

    private static void backtrack(int depth) {
        if (depth == N) {
            ans++;
            return;
        }

        for (int i = 1; i <= 4; i++) {
            if (depth + i <= N) {
                backtrack(depth + i);
            }
        }
    }
}