import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cows = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0, i = 0, j, k;
        while (i < N - 2) {
            j = i + 1;
            while (j < N - 1) {
                if (cows[i] <= cows[j]) {
                    k = j + 1;
                    while (k < N) {
                        if (cows[j] <= cows[k]) {
                            ans++;
                        }
                        k++;
                    }
                }
                j++;
            }
            i++;
        }
        System.out.println(ans);
    }
}
