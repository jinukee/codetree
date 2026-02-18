import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final Map<String, Integer> pointMap = new HashMap<>();
    private static final int LENGTH = 10_001;

    static {
        pointMap.put("G", 1);
        pointMap.put("H", 2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] points = new int[LENGTH];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int position = Integer.parseInt(st.nextToken());
            points[position] = pointMap.get(st.nextToken());
        }

        int ans = 0;
        for (int i = 1; i < LENGTH - K; i++) {
            int temp = 0;
            for (int j = i; j <= i + K; j++) {
                temp += points[j];
            }
            ans = Math.max(temp, ans);
        }
        System.out.println(ans);
    }
}
