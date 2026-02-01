import java.util.*;

public class Main {
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        sb.append("\n");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
        sc.close();
    }
}