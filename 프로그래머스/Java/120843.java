class Solution {
    public int solution(int[] numbers, int k) {
        int position = (k - 1) * 2;
        int index = position % numbers.length;
        return numbers[index];
    }
}