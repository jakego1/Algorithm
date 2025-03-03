import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int option1 = numbers[0] * numbers[1];
        int option2 = numbers[n-1] * numbers[n-2];
        
        return Math.max(option1, option2);
    }
}