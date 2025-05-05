class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            
            boolean isCorrect;
            if (operator.equals("+")) {
                isCorrect = (X + Y == Z);
            } else {
                isCorrect = (X - Y == Z);
            }
            
            answer[i] = isCorrect ? "O" : "X";
        }
        
        return answer;
    }
}