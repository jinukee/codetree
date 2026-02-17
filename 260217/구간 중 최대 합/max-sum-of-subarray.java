import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0, sum;
        for (int i = 0; i <= N - K; i++) {
            sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += nums[j];
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}
