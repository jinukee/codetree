import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] houses = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            houses[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += Math.abs(i - j) * houses[j];
            }
            answer = Math.min(answer, sum);
        }

        System.out.println(answer);
    }
}