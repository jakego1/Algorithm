class Solution {
    public int solution(int slice, int n) {
        
        for ( int pizza = 1 ; ; pizza++ ) {
            if ( slice * pizza >= n ) {
                return pizza;
            }
        }
    }
}