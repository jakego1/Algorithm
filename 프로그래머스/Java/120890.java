class Solution {
    public int solution(int[] array, int n) {
        int closestNumber = array[0];
        int minDifference = Math.abs(array[0] - n);
        
        for (int i = 1; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);
            
            if (currentDifference < minDifference || 
                (currentDifference == minDifference && array[i] < closestNumber)) {
                minDifference = currentDifference;
                closestNumber = array[i];
            }
        }
        
        return closestNumber;
    }
}