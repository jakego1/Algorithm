class Solution {
    public int solution(int a, int b) {
        b /= gcd(a, b);
        
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
        
        return (b == 1) ? 1 : 2;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}