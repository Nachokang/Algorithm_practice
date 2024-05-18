import java.util.*;
import java.io.*;

public class Solution {
    static int[] buildings;
    static int N;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            N = sc.nextInt();
            buildings = new int[N];

            for(int i=0; i<N; i++) {
                buildings[i] = sc.nextInt();
            }

            int total = 0;
            for(int i=2; i<N-2; i++) {
                int max_height = Math.max(buildings[i-2], Math.max(buildings[i-1], Math.max(buildings[i+1], buildings[i+2])));

                if(buildings[i]>max_height) {
                    total += buildings[i] - max_height;
                }
            }

            System.out.println("#"+ test_case + " " + total);
        }
    }
}
