import java.util.*;
public class Main {
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        solution(n, k);
        System.out.println(sb);
    }

    private static void solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while(q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(" ");
        }
        sb.append(q.poll()).append(" ");
    }
}