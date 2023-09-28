import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sorted);
        int[] answer = new int[emergency.length];
        
        for(int i = 0 ; i < emergency.length; i++){
            int target = emergency[i];
            int index = Arrays.binarySearch(sorted, target);
            answer[i] = Math.abs(index+1-emergency.length) +1;
        }
        return answer;
    }
}