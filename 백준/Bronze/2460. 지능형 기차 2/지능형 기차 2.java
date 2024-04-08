import java.io.*;
import java.util.*;

public class Main {
    static int[][] train;
    static int maxPeople = 0;
    static int people = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        train = new int[10][2];

        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            train[i][0] = Integer.parseInt(st.nextToken()); // 내린 사람
            train[i][1] = Integer.parseInt(st.nextToken()); // 탄 사람

            people -= train[i][0];
            people += train[i][1];

            if(maxPeople < people) {
                maxPeople = people;
            }
        }

        System.out.print(maxPeople);
    }

}