import java.util.Scanner;
public class Main {

    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        recursiveAsc(n);
        sb.append("\n");
        recursiveDesc(n);

        System.out.println(sb);
    }

    private static void recursiveAsc(int n) {
        if (n == 0) {
            return;
        }

        recursiveAsc(n - 1);
        sb.append(n).append(" ");
    }

    private static void recursiveDesc(int n) {
        if (n == 0) {
            return;
        }

        sb.append(n).append(" ");
        recursiveDesc(n - 1);
    }
}