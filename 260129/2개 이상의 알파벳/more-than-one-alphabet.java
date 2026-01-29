import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        System.out.println(solution(A));
    }

    private static String solution(String str){
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            unique.add(str.charAt(i));
        }

        if (unique.size() >= 2){
            return "Yes";
        }
        return "No";
    }
}