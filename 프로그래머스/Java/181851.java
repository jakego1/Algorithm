import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> availableStudents = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                availableStudents.add(i);
            }
        }
        
        availableStudents.sort((a, b) -> rank[a] - rank[b]);
        
        int a = availableStudents.get(0);
        int b = availableStudents.get(1);
        int c = availableStudents.get(2);
        
        return 10000 * a + 100 * b + c;
    }
}