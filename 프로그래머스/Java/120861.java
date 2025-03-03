class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            switch (key) {
                case "up":
                    position[1] = Math.min(position[1] + 1, maxY);
                    break;
                case "down":
                    position[1] = Math.max(position[1] - 1, -maxY);
                    break;
                case "left":
                    position[0] = Math.max(position[0] - 1, -maxX);
                    break;
                case "right":
                    position[0] = Math.min(position[0] + 1, maxX);
                    break;
            }
        }
        
        return position;
    }
}