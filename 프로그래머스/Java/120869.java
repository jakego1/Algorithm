import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            if (word.length() == spell.length) {
                boolean isValid = true;
                
                for (String ch : spell) {
                    if (word.indexOf(ch) == -1) {
                        isValid = false;
                        break;
                    }
                }
                
                if (isValid) {
                    Set<Character> uniqueChars = new HashSet<>();
                    for (char c : word.toCharArray()) {
                        uniqueChars.add(c);
                    }
                    
                    if (uniqueChars.size() == spell.length) {
                        return 1;
                    }
                }
            }
        }
        
        return 2;
    }
}