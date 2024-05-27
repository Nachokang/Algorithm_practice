import java.util.*;
import java.io.*;

public class Main {
    static int A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        int num = A*B*C;

        int[] cnt = new int[10];

        char[] numchar = String.valueOf(num).toCharArray();
        for(int i=0; i<numchar.length; i++) {
            cnt[numchar[i]-'0']++;
        }

        for(int i : cnt) {
            System.out.println(i);
        }

    }
}