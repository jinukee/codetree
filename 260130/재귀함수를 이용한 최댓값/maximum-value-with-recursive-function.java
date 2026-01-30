import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(recursion(arr, n));
    }

    private static int recursion(int[] arr, int n) {
        if(n == 1) {
            return arr[n - 1];
        }

        return Math.max(recursion(arr, n - 1), arr[n - 1]);
    }
}