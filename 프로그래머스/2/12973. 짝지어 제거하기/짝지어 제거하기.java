import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        char start = s.charAt(0);
        stk.push(start);

        for(int i = 1; i<s.length(); i++) {
            char bePushed = s.charAt(i);
            if(stk.isEmpty()) {
                stk.push(bePushed);
            }
            else if(bePushed == stk.peek()) {
                stk.pop();
            }
            else if(bePushed != stk.peek()) {
                stk.push(bePushed);
            }
        }
        if(stk.isEmpty()) {
            answer = 1;
        }

        return answer;
    }
}