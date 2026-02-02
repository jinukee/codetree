import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        bubbleSort(arr, n);
        Arrays.stream(arr).forEach((num)->sb.append(num).append(" "));
        System.out.println(sb);
    }

    private static int bubbleSort(int[] arr, int size) {
        boolean sorted = true;
        int count = 0;
        do {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            count++;
        } while (!sorted);
        return count;
    }
}