import java.io.*;
import java.util.*;

public class Main {
    private static final int MIN_VALUE = -999;
    private static final int MAX_VALUE = 999;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int currentMax = MIN_VALUE;
        int currentMin = MAX_VALUE;

        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n == MIN_VALUE || n == MAX_VALUE) {
                break;
            }

            currentMax = Math.max(n, currentMax);
            currentMin = Math.min(n, currentMin);
        }

        System.out.println(currentMax + " " + currentMin);
    }
}