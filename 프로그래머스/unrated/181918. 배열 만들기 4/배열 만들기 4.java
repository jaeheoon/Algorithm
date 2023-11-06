import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tmp= new ArrayList();
        
        int i = 0;
        while(i < arr.length) {
            if(tmp.size() == 0) {
                tmp.add(arr[i++]);
            }
            else {
                int last = tmp.get(tmp.size()-1);
                if(tmp.size() != 0 && last<arr[i]){
                    tmp.add(arr[i++]);
                }
                else if(tmp.size() != 0 && last >= arr[i]) {
                    tmp.remove(tmp.size() - 1);
                }
            }
            
        }
        
        int[] answer = new int[tmp.size()];
        for(int k = 0; k < tmp.size(); k++) {
            answer[k] = tmp.get(k).intValue();
        }
        return answer;
    }
}