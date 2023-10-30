import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int a = -1;
        int b = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                a = i;
                break;
            }
        }
        if (a != -1) {
            for (int i = a; i < arr.length; i++) {
                if (arr[i] == 2) {
                    b = i;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        if (a == -1) {
            list.add(-1);
        } else if (a == b) {
            list.add(2);
        } else {
            for (int i = a; i <= b; i++) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}