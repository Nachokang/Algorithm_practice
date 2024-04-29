import java.io.*;
import java.util.*;

public class Main {
    static String S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();

        char[] c = S.toCharArray();
        int[] alphabet = new int[26];

        for(char al : c) {
            alphabet[al - 'a']++;
        }

        for(int i : alphabet) {
            System.out.print(i + " ");
        }

    }
}