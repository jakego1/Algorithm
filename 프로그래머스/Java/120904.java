class Solution {
    public int solution(int num, int k) {

        String numStr = Integer.toString(num);
        
        char kChar = Integer.toString(k).charAt(0);
        
        int position = numStr.indexOf(kChar);
        
        if (position == -1) {
            return -1;
        }
        
        return position + 1;
    }
}