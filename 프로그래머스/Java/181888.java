class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = (num_list.length - 1) / n + 1;
        int[] answer = new int[count];
        
        for (int i = 0, j = 0; i < num_list.length; i += n, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}