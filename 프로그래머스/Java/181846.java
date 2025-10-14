class Solution {
    public String solution(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder(Math.max(a.length(), b.length()) + 1);
        while (i >= 0 || j >= 0 || carry > 0) {
            int da = i >= 0 ? a.charAt(i--) - '0' : 0;
            int db = j >= 0 ? b.charAt(j--) - '0' : 0;
            int s = da + db + carry;
            sb.append((char) ('0' + (s % 10)));
            carry = s / 10;
        }
        return sb.reverse().toString();
    }
}