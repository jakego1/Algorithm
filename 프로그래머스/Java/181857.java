class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int powerOfTwo = 1;
        
        while (powerOfTwo < len) {
            powerOfTwo *= 2;
        }
        
        int[] answer = new int[powerOfTwo];
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}