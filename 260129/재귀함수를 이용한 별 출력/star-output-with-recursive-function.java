import java.util.Scanner;
public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        makeStarRecursive(n);
        System.out.println(sb);
    }

    private static void makeStarRecursive(int n) {
        if (n == 0) {
            return;
        }
        
        makeStarRecursive(n - 1);
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        sb.append("\n");
    }
}