import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return "No";
                }
                stack.pop();
            }else {
                stack.push(str.charAt(i));
            }
        }
        if(stack.isEmpty()) {
            return "Yes";
        }
        return "No";
    }
}