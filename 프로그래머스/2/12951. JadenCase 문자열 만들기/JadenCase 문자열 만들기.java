class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        boolean isFirstChar = true;
        for (char ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                sb.append(ch);
                isFirstChar = true;
            } else if (isFirstChar) {
                sb.append(Character.toUpperCase(ch));
                isFirstChar = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        answer = sb.toString();
        return answer;
    }
}
