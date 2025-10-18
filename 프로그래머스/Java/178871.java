import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currentIndex = rankMap.get(calling);
            if (currentIndex > 0) {
                String playerAhead = players[currentIndex - 1];
                
                players[currentIndex - 1] = calling;
                players[currentIndex] = playerAhead;
                
                rankMap.put(calling, currentIndex - 1);
                rankMap.put(playerAhead, currentIndex);
            }
        }
        
        return players;
    }
}