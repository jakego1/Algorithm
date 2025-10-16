class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        int idx = 0;
        for (String row : picture) {
            StringBuilder expanded = new StringBuilder();
            for (char c : row.toCharArray()) {
                expanded.append(String.valueOf(c).repeat(k));
            }
            String line = expanded.toString();
            for (int i = 0; i < k; i++) result[idx++] = line;
        }
        return result;
    }
}