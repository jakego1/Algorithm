class Solution {
    public int solution(int[][] lines) {

        int[] counts = new int[201];

        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];
            

            for (int i = start; i < end; i++) {
                counts[i + 100]++;
            }
        }
        
        int overlapLength = 0;
        for (int count : counts) {
            if (count >= 2) {
                overlapLength++;
            }
        }
        
        return overlapLength;
    }
}