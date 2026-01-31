import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if(n == 1) {
            return 2;
        }
        if(n == 2) {
            return 4;
        }

        return (solution(n - 1) * solution(n - 2)) % 100;
    }
}