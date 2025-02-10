class Solution {
    public int solution(int[] array) {
        
        int[] countedArray = new int[1000];
        
        for (int num : array) {
            countedArray[num]++;
        }
        
        int maxCount = 0;
        int maxNum = 0;
        boolean isNotOne = false;
        
        for (int i = 0; i < countedArray.length; i++) {
            if (countedArray[i] > maxCount) {
                maxCount = countedArray[i];
                maxNum = i;
                isNotOne = false;
            } else if (countedArray[i] == maxCount && countedArray[i] != 0) {
                isNotOne = true;
            }
        }
        
        if (isNotOne) {
            return -1;
        }
        return maxNum;
    }
}