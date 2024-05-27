import java.util.*;
import java.io.*;

public class Main {
    static String sentence;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sentence = br.readLine().trim();

        String[] s = sentence.split(" ");

        if(sentence.isBlank()) {
            System.out.println(0);
        }
        else {
            System.out.println(s.length);
        }
        
    }
}