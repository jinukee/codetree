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
        Arrays.stream(arr).forEach((num) -> sb.append(num).append(" "));
        System.out.println(sb);
    }

    private static void bubbleSort(int[] arr, int size) {
        boolean sorted = true;
        do {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        sorted = false;
                    }
                }
            }
        } while (sorted == false);
    }
}