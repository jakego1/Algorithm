class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleWords = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String temp = word;
            
            for (String possible : possibleWords) {
                temp = temp.replace(possible, " ");
            }
            
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}