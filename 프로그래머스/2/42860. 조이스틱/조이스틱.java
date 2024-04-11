class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;
        
        for(int i=0; i<name.length(); i++) {
            answer += Math.min(name.charAt(i)-'A', 26 - (name.charAt(i)-'A'));
            
            if(i<name.length()-1 && name.charAt(i+1) == 'A') {
                int endA = i+1;
                while(endA < name.length() && name.charAt(endA) == 'A') {
                    endA++;
                }
                
                move = Math.min(move, i*2 + (name.length()-endA));
                move = Math.min(move, (name.length()-endA)*2 + i);
            }
        }
        
        answer += move;
        return answer;
    }
}


/*
a b c d e f g h i j k l m n o p q r s t u v w x y z
1. 위로갈지 아래로 갈지 정하기
    - 위로가기 : 타겟 - 'A'
    - 아래로가기 : 26 - (타겟-'A')
2. 커서를 왼쪽으로 갈지 오른쪽으로 갈지 정하기
    - 오른쪽으로 쭉 가기 : name.length() - 2
    - 오른쪽으로 갔다가 왼쪽으로 가기 : 오른쪽으로 간만큼 * 2 + 연속A끝나는지점
    - 왼쪽으로 갔다가 오른쪽으로 가기 : 연속A끝나는지점 * 2 + 오른쪽으로 간만큼
*/