import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int[] prev = Arrays.copyOf(arr, arr.length);
        
        while (true) {
            int[] next = new int[arr.length];
            
            for (int i = 0; i < prev.length; i++) {
                if (prev[i] >= 50 && prev[i] % 2 == 0) {
                    next[i] = prev[i] / 2;
                } else if (prev[i] < 50 && prev[i] % 2 == 1) {
                    next[i] = prev[i] * 2 + 1;
                } else {
                    next[i] = prev[i];
                }
            }
            
            x++;
            
            if (Arrays.equals(prev, next)) {
                return x - 1;
            }
            
            prev = next;
        }
    }
}