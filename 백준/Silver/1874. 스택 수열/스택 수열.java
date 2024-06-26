import java.io.*;
import java.util.*;

class Main {
    static int n;
    static Stack<Integer> s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        s = new Stack<>();
        int idx = 0;
        int curr = 1;
        StringBuilder sb = new StringBuilder();

        while(idx < n) {
            if(!s.isEmpty() && nums[idx] < s.get(s.size()-1)) {
                break;
            }

            else if(!s.isEmpty() && nums[idx] == s.get(s.size()-1)) {
                s.pop();
                sb.append("-").append("\n");
                idx++;
            }

            else {
                while(curr <= n) {
                    if(nums[idx] != curr) {
                        s.push(curr);
                        sb.append("+").append("\n");
                        curr++;
                    }
                    else {
                        s.push(curr);
                        sb.append("+").append("\n");
                        curr++;
                        break;
                    }
                }
            }
        }

        if(idx == n) {
            System.out.print(sb);
        }
        else {
            System.out.println("NO");
        }
    }
}