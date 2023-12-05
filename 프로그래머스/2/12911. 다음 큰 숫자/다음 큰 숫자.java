class Solution {
    public int solution(int n) {
        int answer = n;

        while(true) {
            answer++;

            String answerbi = Integer.toBinaryString(answer);
            String nbi = Integer.toBinaryString(n);

            int onecnt = 0;
            int onecnt2 = 0;

            for(int i = 0; i<answerbi.length(); i++) {
                if(answerbi.charAt(i) == '1') {
                    onecnt+=1;
                }
            }

            for(int j = 0; j<nbi.length(); j++) {
                if(nbi.charAt(j) == '1') {
                    onecnt2+=1;
                }
            }

            if(onecnt==onecnt2) {
                break;
            }
        }

        return answer;
    }
}