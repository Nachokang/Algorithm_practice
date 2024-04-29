import java.io.*;
import java.util.*;

public class Main {
    static String s;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        ListIterator<Character> listIter = list.listIterator(list.size());
        // 이터레이터의 시작 위치를 맨 끝으로
        // 전 노드는 previous, 다음 노드는 next
        // add와 remove 모두 현재 노드의 다음 노드에서 실행됨

        // L -> 커서를 왼쪽으로. 맨 앞이면 무시
        // D -> 커서를 오른쪽으로. 맨 뒤면 무시
        // B -> 커서 왼쪽의 문자를 삭제. 맨 앞이면 무시
        // P $ -> 입력 받은 문자 $를 커서 왼쪽에 추가

        for(int i=0; i<M; i++) {
            String command = br.readLine();
            char cmd = command.charAt(0);

            switch(cmd) {
                case 'L' :
                    if(listIter.hasPrevious()) {
                        listIter.previous();
                    }
                    break;
                case 'D' :
                    if(listIter.hasNext()) {
                        listIter.next();
                    }
                    break;
                case 'B':
                    if(listIter.hasPrevious()) {
                        listIter.previous();
                        listIter.remove();
                    }
                    break;
                case 'P':
                    char ch = command.charAt(2);
                    listIter.add(ch);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : list) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}