import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX_VALUE = 40_000;
    private static final int MIN_VALUE = 1;

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
        for (int i = 0; i < N; i++) {
            int xMax = MIN_VALUE, yMax = MIN_VALUE, xMin = MAX_VALUE, yMin = MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (j == i) {
                    continue;
                }
                xMax = Math.max(xMax, xValues[j]);
                xMin = Math.min(xMin, xValues[j]);
                yMax = Math.max(yMax, yValues[j]);
                yMin = Math.min(yMin, yValues[j]);
            }
            ans = Math.min(ans, (xMax - xMin) * (yMax - yMin));
        }

        System.out.println(ans);
    }
}
