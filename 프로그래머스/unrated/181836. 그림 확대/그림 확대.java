import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < picture.length; i++) {
            String[] spl = picture[i].split("");
            String str = "";
            for (int j = 0; j < spl.length; j++) {
                str += spl[j].repeat(k);
            }
            for (int j = 0; j < k; j++) {
                list.add(str);
            }
        }
        
        return list.toArray(new String[list.size()]);

    }
}