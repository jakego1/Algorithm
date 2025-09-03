import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        
        return X.stream().mapToInt(x -> x).toArray();
    }
}