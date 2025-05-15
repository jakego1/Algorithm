class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] averages = new double[n];
        int[] ranks = new int[n];
        
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for (int i = 0; i < n; i++) {
            ranks[i] = 1;
            for (int j = 0; j < n; j++) {
                if (averages[j] > averages[i]) {
                    ranks[i]++;
                }
            }
        }
        
        return ranks;
    }
}