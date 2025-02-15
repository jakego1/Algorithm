class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int order = 1;

            for (int j = 0; j < n; j++) {

                if (emergency[j] > emergency[i]) {
                    order++;
                }
            }
            result[i] = order;
        }
        
        return result;
    }
}