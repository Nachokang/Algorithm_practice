import java.io.*;
import java.util.*;

public class Main {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            String password = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator(list.size());
            for(int j=0; j<password.length(); j++) {
                char c = password.charAt(j);

                switch(c) {
                    case '-':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    case '<':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case '>':
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    default:
                        iterator.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();

            for(char ch : list) {
                sb.append(ch);
            }
            System.out.println(sb);
        }
    }
}