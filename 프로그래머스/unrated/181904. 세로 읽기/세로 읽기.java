import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for (int i=0; i < my_string.length(); i += m) {
            String a = my_string.substring(i, i + m);
            list.add(a);
        }

        for (String str : list) {
            answer += str.substring(c-1, c);
        }
        
        return answer;
    }
}