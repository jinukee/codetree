import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abilities = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            abilities[i] = Integer.parseInt(st.nextToken());
        }

        int total = Arrays.stream(abilities).sum();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int sum = abilities[i] + abilities[j] + abilities[k];
                    ans = Math.min(Math.abs(total - 2 * sum), ans);
                }
            }
        }

        System.out.println(ans);
    }
}
