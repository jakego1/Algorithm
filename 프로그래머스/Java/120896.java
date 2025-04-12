import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        TreeSet<Character> singleChars = new TreeSet<>();
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                singleChars.add(entry.getKey());
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : singleChars) {
            result.append(c);
        }
        
        return result.toString();
    }
}