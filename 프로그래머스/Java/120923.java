class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int middle = total / num;
        int start;
        
        if (num % 2 == 0) {
            start = middle - (num / 2 - 1);
        } else {
            start = middle - (num / 2);
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}