import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MOD = 10_007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }

    private static int solution(int n) {
        if (n == 2 || n == 3) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = dp[2] = dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i - 2] + 1, dp[i - 3] + 1) % MOD;
        }

        return dp[n];
    }
}