import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a|b|c", " ");
        ArrayList <String> list = new ArrayList<>();
        String[] str = myStr.split(" ");
        
        for (int i = 0; i < str.length; i ++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }

        String[] answer = new String [list.size()];

        if (answer.length == 0) {		
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }

        for (int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}