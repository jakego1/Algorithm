import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisorList = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisorList.add(i);
                
                if (i != n / i) {
                    divisorList.add(n / i);
                }
            }
        }
        
        Collections.sort(divisorList);
        
        int[] answer = new int[divisorList.size()];
        for (int i = 0; i < divisorList.size(); i++) {
            answer[i] = divisorList.get(i);
        }
        
        return answer;
    }
}