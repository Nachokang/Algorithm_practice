import java.util.*;
import java.io.*;

public class Main {
    static int[] triangle;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        triangle = new int[3];

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<3; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(triangle);

            if(triangle[0]==0 && triangle[1]==0 && triangle[2]==0) {
                break;
            }

            if(Math.pow(triangle[2], 2) == Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }

    }
}