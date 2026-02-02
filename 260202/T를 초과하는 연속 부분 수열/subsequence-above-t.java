import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int answer = 0;
        int temp = 0;

        if (arr[0] > t) {
            answer = 1;
        }

        for (int i = 1; i < n; i++) {
            if(arr[i - 1] >= arr[i] || arr[i] < t) {
                answer = Math.max(answer, temp);
                temp = 0;
                continue;
            }
            temp++;
        }
        
        answer = Math.max(answer, temp);
        System.out.println(answer);
    }
}