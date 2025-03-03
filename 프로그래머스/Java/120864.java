class Solution {
    public int solution(String my_string) {
        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    sum += Integer.parseInt(currentNumber.toString());
                    currentNumber = new StringBuilder();
                }
            }
        }
        
        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }
        
        return sum;
    }
}