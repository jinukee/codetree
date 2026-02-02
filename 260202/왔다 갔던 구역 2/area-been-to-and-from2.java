import java.util.Scanner;
public class Main {
    private static int[] xAxis = new int[2001];
    private static int current = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            move(x, dir);
        }

        int count = 0;
        for (int x : xAxis) {
            if (x >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void move(int x, char dir) {
        if (dir == 'L') {
            current -= x;
        }

        for (int i = 0; i < x; i++) {
            xAxis[current++]++;
        }

        if (dir == 'L') {
            current -= x;
        }
    }
}