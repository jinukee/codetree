import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int openIdx = 0;
        int ans = 0;

        while (openIdx < input.length()) {
            if (input.charAt(openIdx) != '(') {
                openIdx++;
                continue;
            }

            for (int i = openIdx + 1; i < input.length(); i++) {
                if (input.charAt(i) == ')') {
                    ans++;
                }
            }
            openIdx++;
        }

        System.out.print(ans);
    }
}
