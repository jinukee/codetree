import java.util.Scanner;
public class Main {
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        makeStarRecursion(n);
        System.out.println(sb);
    }

    private static void makeStarRecursion(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            sb.append("*").append(" ");
        }
        sb.append("\n");
        makeStarRecursion(n - 1);
        for (int i = 0; i < n; i++) {
            sb.append("*").append(" ");
        }
        sb.append("\n");
    }
}