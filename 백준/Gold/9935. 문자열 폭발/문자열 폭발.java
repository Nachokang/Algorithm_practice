import java.util.*;
import java.io.*;

public class Main {
    static String target;
    static String bomb;
    static Stack<Character> s;
    static String FRULA = "FRULA";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = br.readLine();
        bomb = br.readLine();

        int target_length = target.length();
        int bomb_length = bomb.length();

        s = new Stack<>();

        for(int i=0; i<target_length; i++) {
            s.push(target.charAt(i));

            if(s.size() >= bomb_length) {
                boolean flag = true;

                for(int j=0; j<bomb_length; j++) {
                    if(s.get(s.size()-bomb_length + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    for(int j=0; j<bomb_length; j++) {
                        s.pop();
                    }
                }
            }
        }

        if(s.isEmpty()) {
            System.out.println(FRULA);
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(Character c : s) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}