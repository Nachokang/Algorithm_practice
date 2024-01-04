class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown+yellow;

        for(int height=3; height<size; height++) {
            int width = size/height;

            if(width>=height) {
                if((height-2) * (width-2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        return answer;
    }
}