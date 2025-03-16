public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder decoded = new StringBuilder();
        
        for (int i = code - 1; i < cipher.length(); i += code) {
            decoded.append(cipher.charAt(i));
        }
        
        return decoded.toString();
    }
}