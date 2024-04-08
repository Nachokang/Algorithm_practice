import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] height;
    static int[] count;
    static long buildings;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        height = new int[N+1];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
        }

        int temp = height[0];
        int temp2 = 0;
        count = new int[N+1];

        for(int i=0; i<N+1; i++) {
            if(i==N) {
                break;
            }
            temp2 = i+1;
            while(true) {
                if(height[temp2]<temp && height[temp2]!=0) {
                    count[i] += 1;
                    temp2++;
                }
                else {
                    temp = height[i+1];
                    break;
                }
            }
        }

        for(int i : count) {
            buildings += i;
        }

        System.out.print(buildings);
    }
}