import java.util.*;
import java.io.*;

public class Main {
    static String word;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();

        for(int i=0; i<26; i++) {
            if(word.contains(""+(char)(i+'a'))) {
                System.out.print(word.indexOf((char)(i+'a')) + " ");
            }
            else {
                System.out.print(-1 + " ");
            }
        }
    }
}