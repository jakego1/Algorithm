class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}