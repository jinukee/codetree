import java.util.Scanner;
public class Main {
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        recursive(n);
        System.out.println(sb);
    }

    private static void recursive(int n) {
        if(n == 0) {
            return;
        }

        sb.append(n).append(" ");
        recursive(n - 1);
        sb.append(n).append(" ");
    }
}