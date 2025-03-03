class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        int count = 0;
        
        for (int i = max - min + 1; i <= max; i++) {
            count++;
        }
        
        for (int i = max + 1; i < max + min; i++) {
            count++;
        }
        
        return count;
    }
}