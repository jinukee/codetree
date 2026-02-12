import java.util.Scanner;

public class Main {
    private static final StringBuilder sb = new StringBuilder();
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        arr = new int[n];

        choose(1, n, k);
        System.out.print(sb);
    }

    private static void choose(int now, int n, int k) {
        if(now == n + 1) {
            for(int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= k; i++) {
            arr[now - 1] = i;
            choose(now + 1, n, k);
        }
    }
}