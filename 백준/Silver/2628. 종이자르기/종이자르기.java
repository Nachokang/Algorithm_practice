import java.io.*;
import java.util.*;

public class Main {
    static int X;
    static int Y;
    static int N;
    static ArrayList<Integer> cutX;
    static ArrayList<Integer> cutY;
    static int maxX, maxY;
    static int XorY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        cutX = new ArrayList<>();
        cutY = new ArrayList<>();

        cutX.add(0);
        cutX.add(Y);
        cutY.add(0);
        cutY.add(X);

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            XorY = Integer.parseInt(st.nextToken());
            if(XorY == 0) {
                cutX.add(Integer.parseInt(st.nextToken()));
            }
            else if(XorY == 1) {
                cutY.add(Integer.parseInt(st.nextToken()));
            }
        }

        Collections.sort(cutX);
        Collections.sort(cutY);

        cutX();
        cutY();

        System.out.print(maxX * maxY);
    }

    public static void cutX() {
        for(int i=0; i<cutX.size()-1; i++) {
            int num = cutX.get((i+1)) - cutX.get(i);
            maxY = Math.max(maxY, num);
        }
    }

    public static void cutY() {
        for(int i=0; i<cutY.size()-1; i++) {
            int num = cutY.get((i+1)) - cutY.get(i);
            maxX = Math.max(maxX, num);
        }
    }
}