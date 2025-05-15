import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            
            if (distA == distB) {
                return b - a;
            }
            
            return distA - distB;
        });
        
        return Arrays.stream(nums).mapToInt(i -> i).toArray();
    }
}