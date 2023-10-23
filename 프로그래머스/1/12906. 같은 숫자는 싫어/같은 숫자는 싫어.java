import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int a = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != a){
                list.add(arr[i]);
                a = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}