class Solution {
    public int[] solution(int[] arr) {
        int firstTwo = -1;
        int lastTwo = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstTwo == -1) {
                    firstTwo = i;
                }
                lastTwo = i;
            }
        }
        
        if (firstTwo == -1) {
            return new int[]{-1};
        }
        
        int[] result = new int[lastTwo - firstTwo + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[firstTwo + i];
        }
        
        return result;
    }
}