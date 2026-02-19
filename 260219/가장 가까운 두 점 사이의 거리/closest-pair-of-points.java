import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] xValues = new int[N];
        int[] yValues = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            xValues[i] = Integer.parseInt(st.nextToken());
            yValues[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                ans = Math.min((int) (Math.pow(xValues[i] - xValues[j], 2) + Math.pow(yValues[i] - yValues[j], 2)), ans);
            }
        }

        System.out.println(ans);
    }
}
