class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean result = false;
        
        if (ineq.equals(">") && eq.equals("=")) {
            result = n >= m;
        } else if (ineq.equals("<") && eq.equals("=")) {
            result = n <= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            result = n > m;
        } else if (ineq.equals("<") && eq.equals("!")) {
            result = n < m;
        }
        
        return result ? 1 : 0;
    }
}