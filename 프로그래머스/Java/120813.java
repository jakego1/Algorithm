class Solution {
    public int[] solution(int n) {
        
        int OddCount = 0;
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 1) {
                OddCount++;
            }
        }
        
        int[] oddNumList = new int[OddCount];
        
        int index = 0;
        for (int i = 1 ; i <= n ; i++) {
            if (i % 2 == 1) {
                oddNumList[index] = i;
                index++;
            }
        }
        
        return oddNumList;
    }
}