import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (String str : intStrs) {
            String subStr = str.substring(s, s + l);
            int num = Integer.parseInt(subStr);
            if (num > k) {
                result.add(num);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}