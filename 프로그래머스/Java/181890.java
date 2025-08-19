class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                String[] answer = new String[i];
                for (int j = 0; j < i; j++) {
                    answer[j] = str_list[j];
                }
                return answer;
            } else if (str_list[i].equals("r")) {
                String[] answer = new String[str_list.length - i - 1];
                for (int j = 0; j < answer.length; j++) {
                    answer[j] = str_list[i + 1 + j];
                }
                return answer;
            }
        }
        return new String[0];
    }
}