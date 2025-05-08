class Solution {
    public String solution(String my_string) {

        String lowerCase = my_string.toLowerCase();
        
        char[] charArray = lowerCase.toCharArray();
        
        java.util.Arrays.sort(charArray);
        
        return new String(charArray);
    }
}