class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxX = Math.max(maxX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        int width = maxX - minX;
        int height = maxY - minY;
        
        return width * height;
    }
}