import java.util.Scanner;
public class Main {
    private static int[] xAxis = new int[200];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt() + 100;
            int end = sc.nextInt() + 100;

            for (int j = start; j < end; j++) {
                xAxis[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 200; i++) {
            if (xAxis[i] > 0) {
                max = Math.max(max, xAxis[i]);
            }
        }
        System.out.println(max);
    }
}