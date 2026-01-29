import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int currentMin = nums[0];
        int count = 1;

        for(int i = 1; i < N; i++) {
            if (currentMin > nums[i]) {
                currentMin = nums[i];
                count = 1;
            } else if (currentMin == nums[i]) {
                count++;
            }
        }

        System.out.println(currentMin + " " + count);
        br.close();
    }
}