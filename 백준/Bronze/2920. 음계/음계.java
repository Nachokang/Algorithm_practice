import java.util.*;
import java.io.*;

public class Main {
    static int[] notes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        notes = new int[8];
        boolean isAsc = true;
        boolean isDes = true;

        for(int i=0; i<8; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<notes.length-1; i++) {
            if(notes[i] < notes[i+1]) {
                isDes = false;
            }
            else if(notes[i] > notes[i+1]) {
                isAsc = false;
            }
        }

        if(isAsc) {
            System.out.println("ascending");
        }
        else if(isDes) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}