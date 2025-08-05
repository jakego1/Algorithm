class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            while (s < e) {
                char temp = chars[s];
                chars[s] = chars[e];
                chars[e] = temp;
                s++;
                e--;
            }
        }
        
        return new String(chars);
    }
}