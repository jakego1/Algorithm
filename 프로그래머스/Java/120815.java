class Solution {
    public int solution(int n) {
        for (int pizza = 1 ; ; pizza++) {
            if ((pizza * 6) % n == 0) {  
                return pizza;
            } 
        }
    }
}