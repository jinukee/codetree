import java.util.Scanner;
public class Main {
    private static int[] blocks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        blocks = new int[N + 1];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            stack(A, B);
        }
        int max = 0;
        for (int block : blocks) {
            max = Math.max(max, block);
        }
        System.out.println(max);
    }

    private static void stack(int start, int end) {
        for (int i = start; i <= end; i++) {
            blocks[i]++;
        }
    }
}