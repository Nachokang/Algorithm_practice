class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;

        while (start <= n) {
            int sum = 0;
            int i = start;

            while (sum < n) {
                sum += i;
                i++;

                if (sum == n) {
                    answer++;
                    break;
                }
            }
            start++;
        }

        return answer;
    }
}