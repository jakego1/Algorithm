class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int n = Math.max(r, c);
        int[][] res = new int[n][n];
        for (int i = 0; i < r; i++) {
            System.arraycopy(arr[i], 0, res[i], 0, c);
        }
        return res;
    }
}