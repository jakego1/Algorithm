class Solution {
    public int solution(int[] array) {
        int count = 0;
        
        for (int number : array) {

            String numStr = String.valueOf(number);

            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '7') {
                    count++;
                }
            }
        }
        
        return count;
    }
}