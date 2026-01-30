import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(recursion(n, 0));
    }

    private static int recursion(int n, int count) {
        if(n == 1) {
            return count;
        }

        if(n % 2 == 0) {
            return recursion(n / 2, ++count);
        }
        return recursion(n / 3, ++count);
    }
}