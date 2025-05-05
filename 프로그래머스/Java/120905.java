import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {

        List<Integer> multiples = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                multiples.add(num);
            }
        }
        
        int[] answer = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            answer[i] = multiples.get(i);
        }
        
        return answer;
    }
}