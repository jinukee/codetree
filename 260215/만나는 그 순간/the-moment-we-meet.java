import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final int[] A = new int[1_000];
    private static final int[] B = new int[1_000];
    private static final Map<String, Integer> DIRECTION = new HashMap<>();

    static {
        DIRECTION.put("R", 1);
        DIRECTION.put("L", -1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int ta = 0, tb = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = DIRECTION.get(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            while (count-- > 0) {
                A[ta + 1] = A[ta++] + dir;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = DIRECTION.get(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            while (count-- > 0) {
                B[tb + 1] = B[tb++] + dir;
            }
        }

        int end = Math.min(ta, tb);
        int result = -1;
        for (int i = 1; i < end; i++) {
            if (A[i] == B[i]) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
