import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;

        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i]);
                i++;
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}