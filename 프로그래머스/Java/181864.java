class Solution {
    public int solution(String myString, String pat) {
        String swapped = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        return swapped.contains(pat) ? 1 : 0;
    }
}