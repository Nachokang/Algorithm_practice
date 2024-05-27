import java.util.*;
import java.io.*;

public class Main {
    static int T;
    static String quiz;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            quiz = br.readLine();
            int score = 0;
            int cnt = 0;
            for(int j=0; j<quiz.length(); j++) {
                if(quiz.charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                
                score += cnt;
            }
            
            System.out.println(score);
        }
    }
}