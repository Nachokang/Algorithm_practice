import java.util.*;
import java.io.*;

public class Main {
    static double A, B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Double.parseDouble(st.nextToken());
        B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);
    }
}