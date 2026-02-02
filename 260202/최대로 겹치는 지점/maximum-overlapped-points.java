import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xAxis = new int[100];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                xAxis[j]++;
            }
        }
        int max = 0;
        for (int x : xAxis) {
            max = Math.max(max, x);
        }
        System.out.println(max);
    }
}