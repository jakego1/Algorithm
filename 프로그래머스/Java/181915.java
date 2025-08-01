import java.util.stream.*;
import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        return Arrays.stream(index_list)
            .mapToObj(i -> String.valueOf(my_string.charAt(i)))
            .collect(Collectors.joining());
    }
}