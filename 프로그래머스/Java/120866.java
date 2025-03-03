class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] dangerZone = new int[n][n];
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    dangerZone[i][j] = 1;
                    
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            dangerZone[nx][ny] = 1;
                        }
                    }
                }
            }
        }
        
        int safeZoneCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerZone[i][j] == 0) {
                    safeZoneCount++;
                }
            }
        }
        
        return safeZoneCount;
    }
}