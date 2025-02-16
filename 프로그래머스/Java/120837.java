class Solution {
    public int solution(int hp) {
        int count = 0;
        
        count += hp / 5;
        hp = hp % 5;
        
        count += hp / 3;
        hp = hp % 3;
        
        count += hp;
        
        return count;
    }
}