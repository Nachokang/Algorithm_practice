import java.util.*;
import java.io.*;

public class Main {
    static String word;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
        int[] alphabet = new int[26];
        int max = 0;

        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                alphabet[word.charAt(i) - 'A']++;
            } else {
                alphabet[word.charAt(i) - 'a']++;
            }
        }

        char answer = ' ';

        for(int i=0; i<alphabet.length; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                answer = (char)(i+65);
            }
            else if(alphabet[i] == max) {
                answer = '?';
            }

        }

        System.out.println(answer);
    }
}