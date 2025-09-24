import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean shouldDelete = false;
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    shouldDelete = true;
                    break;
                }
            }
            
            if (!shouldDelete) {
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}