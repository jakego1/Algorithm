class Solution {
    public int solution(int balls, int share) {
        if (share > balls - share) {
            share = balls - share;
        }
        
        if (share == 0) {
            return 1;
        }
        
        long answer = 1;
        
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        return (int) answer;
    }
}