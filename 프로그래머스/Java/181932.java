class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);
            
            if (currentChar == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if (mode == 0) {
                    if (idx % 2 == 0) {
                        ret.append(currentChar);
                    }
                } else {
                    if (idx % 2 == 1) {
                        ret.append(currentChar);
                    }
                }
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}