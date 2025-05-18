class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int resultSize = (length + n - 1) / n;
        
        String[] result = new String[resultSize];
        
        for (int i = 0; i < resultSize; i++) {
            int start = i * n;
            int end = Math.min(start + n, length);
            result[i] = my_str.substring(start, end);
        }
        
        return result;
    }
}