import java.util.*;
import java.io.*;

public class Main {
    static int T;
    static int R;
    static String S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            StringBuilder sb = new StringBuilder();
            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            System.out.println(sb);
        }

    }
}