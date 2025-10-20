class Solution {
    public int[] solution(String[] park, String[] routes) {
        int Height= park.length;
        int Width = park[0].length();

        int startY = 0, startX = 0;
        for(int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                if (park[i].charAt(j) == 'S') {
                    startY = i;
                    startX = j;
                    break;
                }
            }
        }

        int currentY = startY;
        int currentX = startX;

        for(String route : routes) {
            String[] divisions = route.split(" ");
            char direction = divisions[0].charAt(0);
            int distance = Integer.parseInt(divisions[1]);

            int dy = 0, dx = 0;
            if (direction == 'N') dy = -1;
            else if (direction == 'S') dy = 1;
            else if (direction == 'W') dx = -1;
            else if (direction == 'E') dx = 1;

            boolean canMove = true;
            int newY = currentY;
            int newX = currentX;

            for (int step = 1; step <= distance; step++) {
                newY = currentY + dy * step;
                newX = currentX + dx * step;

                if (newY < 0 || newY >= Height || newX < 0 || newX >= Width) {
                    canMove = false;
                    break;
                }

                if (park[newY].charAt(newX) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                currentY = newY;
                currentX = newX;
            }
        }

        return new int[] {currentY, currentX};
    }
}