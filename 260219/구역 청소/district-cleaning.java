import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int[] section = new int[101];
        for(int i = a; i < b; i++) {
            section[i] = 1;
        }

        for(int i = c; i < d; i++) {
            section[i] = 1;
        }

        System.out.println(Arrays.stream(section).sum());
    }
}