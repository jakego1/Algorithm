class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c < 'l') {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}