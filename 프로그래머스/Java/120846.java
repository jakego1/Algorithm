class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 4; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isComposite(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}