import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        
        Map<Integer, Long> freq = Arrays.stream(dice)
            .boxed()
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        
        List<Map.Entry<Integer, Long>> entries = freq.entrySet().stream()
            .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
            .collect(Collectors.toList());
        
        long maxFreq = entries.get(0).getValue();
        
        if (maxFreq == 4) {
            return 1111 * entries.get(0).getKey();
        }
        if (maxFreq == 3) {
            int p = entries.get(0).getKey();
            int q = entries.get(1).getKey();
            return (10 * p + q) * (10 * p + q);
        }
        if (maxFreq == 2 && entries.get(1).getValue() == 2) {
            int p = entries.get(0).getKey();
            int q = entries.get(1).getKey();
            return (p + q) * Math.abs(p - q);
        }
        if (maxFreq == 2) {
            return entries.stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .reduce(1, (x, y) -> x * y);
        }
        
        return Arrays.stream(dice).min().orElse(0);
    }
}