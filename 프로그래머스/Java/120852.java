import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> primeFactors = new HashSet<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(primeFactors);
        java.util.Collections.sort(result);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}