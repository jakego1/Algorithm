class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    private boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        double slope1 = getSlope(dot1, dot2);
        double slope2 = getSlope(dot3, dot4);
        
        return slope1 == slope2;
    }
    
    private double getSlope(int[] dot1, int[] dot2) {
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}