import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int[] array = new int[intStrs.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            array[i] = Integer.valueOf(intStrs[i].substring(s, s + l));
            if (array[i] > k) {
                list.add(array[i]);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}