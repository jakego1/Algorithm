class Solution {
    public long solution(String numbers) {
        String[] words = {"zero", "one", "two", "three", 
                          "four", "five", "six", "seven", "eight", "nine"};
        String result = "";
        while (numbers.length() > 0) {
            for (int i = 0; i < words.length; i++) {
                if (numbers.startsWith(words[i])) {
                    result += i;
                    numbers = numbers.substring(words[i].length());
                    break;
                }
            }
        }
        return Long.parseLong(result);
    }
}