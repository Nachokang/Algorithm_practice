import java.util.*;
import java.io.*;

public class Main {
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nums = new int[5];
        int serial = 0;

        for(int i=0; i<5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            nums[i] *= nums[i];
            serial += nums[i];
        }
        serial %= 10;
        System.out.println(serial);
    }
}