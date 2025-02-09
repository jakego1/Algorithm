class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int inteNu = (numer1 * denom2) + (numer2 * denom1);
        int inteDe = denom1 * denom2;
        
        int gcd = getGcd(inteNu, inteDe);
        
        return new int[] {inteNu/gcd, inteDe/gcd};
            
        }
            
    private int getGcd(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;

        for (int i = 1; i <= min ; i++) {
            if ( a % i == 0 && b % i == 0 ) {
                gcd = i;
            }
        }
        return gcd;
    }
}