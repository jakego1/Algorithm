import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> minPress = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int press = i + 1;
                minPress.put(ch, Math.min(minPress.getOrDefault(ch, Integer.MAX_VALUE), press));
            }
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;
            boolean possible = true;

            for (char ch : target.toCharArray()) {
                if (!minPress.containsKey(ch)) {
                    possible = false;
                    break;
                }
                totalPress += minPress.get(ch);
            }

            answer[i] = possible ? totalPress : -1;
        }
        
        return answer;
    }
}