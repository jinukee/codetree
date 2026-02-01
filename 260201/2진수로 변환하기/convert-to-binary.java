import java.util.Scanner;
public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[101];
        int count = 0;

        while(true) {
            if (n < 2) {
                binary[count++] = n;
                break;
            }

            binary[count++] = n % 2;
            n /= 2;
        }

        for(int i = count - 1; i >= 0; i--) {
            sb.append(binary[i]);
        }

        System.out.println(sb);
        sc.close();
    }
}