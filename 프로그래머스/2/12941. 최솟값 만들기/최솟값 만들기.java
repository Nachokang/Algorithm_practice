import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int maxA = 0;
        int maxB = 0;

        for(int num : A) {
            if(num >= maxA) {
                maxA = num;
            }
        }
        for(int num : B) {
            if(num >= maxB) {
                maxB = num;
            }
        }

        Arrays.sort(B);
        Arrays.sort(A);

        if(maxB>=maxA) {
            for(int i = 0; i<B.length; i++) {
                answer += A[i] * B[B.length-1-i];
            }
        }
        else {
            for(int i = 0; i<A.length; i++) {
                answer += B[i] * A[A.length-1-i];
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}