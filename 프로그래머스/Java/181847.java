class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        int startIndex = 0;
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                startIndex = i;
                break;
            }
        }
        
        answer = n_str.substring(startIndex);
        
        return answer;
    }
}