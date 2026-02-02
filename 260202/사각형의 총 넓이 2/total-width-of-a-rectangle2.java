import java.util.Scanner;
public class Main {
    private static final int MAX_LENGTH = 201;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[MAX_LENGTH][MAX_LENGTH];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    graph[x][y] = 1;
                }
            }
        }

        int answer = 0;

        for(int x = 0; x < MAX_LENGTH; x++) {
            for (int y = 0; y < MAX_LENGTH; y++){
                answer += graph[x][y];
            }
        }
        
        System.out.println(answer);
    }
}