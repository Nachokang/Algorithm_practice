import java.util.*;
import java.io.*;

public class Main {
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nums = new int[10];
        int cnt = 0;

        for(int i=0; i<10; i++) {
            nums[i] = Integer.parseInt(br.readLine())%42;
            boolean check = false;
            for(int j=0; j<i; j++) {
                if(nums[i] == nums[j]) {
                    check = true;
                    break;
                }
                else {
                    check = false;
                }
            }
            if(!check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}