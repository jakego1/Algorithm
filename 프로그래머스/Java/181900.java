class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] toRemove = new boolean[my_string.length()];
        
        for (int index : indices) {
            toRemove[index] = true;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!toRemove[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}