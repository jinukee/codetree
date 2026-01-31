import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(solution(a, b, c, d));
    }

    private static int solution(int startH, int startM, int endH, int endM) {
        return (endH * 60 + endM) - (startH * 60 + startM);
    }
}